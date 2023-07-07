package com.example.callRest.Restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.callRest.VoClass.BookDetailVo;
import com.example.callRest.service.BookService;

@RestController
@RequestMapping("bookApi")
public class BookRestController {

	@Autowired
	BookService bookService;

	@PostMapping("/searchBook")
	public @ResponseBody BookDetailVo searchBook(@RequestBody BookDetailVo bookRequestVo) {

		BookDetailVo bookResponceVo = new BookDetailVo();
		List<BookDetailVo> listBookDetailVo = new ArrayList<>();

		if (bookRequestVo.getSearchDataBy() != null || bookRequestVo.getSearchDataField() != null) {
			listBookDetailVo = bookService.findBookbyRequest(bookRequestVo);

			BookDetailVo bookTestVo = new BookDetailVo();
			bookTestVo.setBookName("Static-Data");
			bookTestVo.setDescription("Static-Data");
			bookTestVo.setId(1L);
			bookTestVo.setPrice(500L);
			listBookDetailVo.add(bookTestVo);

			bookResponceVo.setListBookDetailVo(listBookDetailVo);
			bookResponceVo.setMessage("success");
			bookResponceVo.setStatus(200);

		} else {
			bookResponceVo.setMessage("Pls provide complete search detail !!");
			bookResponceVo.setStatus(400);
		}

		

		return bookResponceVo;

	}

}