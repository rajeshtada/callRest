package com.example.callRest.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.callRest.entity.Book;
import com.example.callRest.service.BookService;

@Controller
@RequestMapping("/Book")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/AddBook")
	public String addBook(Model model) {
		System.out.println("in AddBook Controller");
		model.addAttribute("book", new Book());
		return "addBook";

	}

	@PostMapping("/addBookDetails")
	public String addBookDetails(@ModelAttribute Book book, Model model, RedirectAttributes ru) {

		if (book.getId() != null && !book.getId().equals("")) {
			try {

//				bookService.updateBookDetail(book);
				Book saveBook = bookService.saveBook(book);
				model.addAttribute("msg", "Detail Updated Successfully !!");
				ru.addFlashAttribute("msg", "<span style='color:green;'>Detail Updated Successfully !!</span>");
			} catch (Exception e) {
				e.printStackTrace();
				ru.addFlashAttribute("msg", "<span style='color:red;'>Error while update detail.</span>");
			}
			return "redirect:/Book/LibraryStock";

		} else {
			try {
				Book saveBook = bookService.saveBook(book);
				if (saveBook != null) {
					ru.addFlashAttribute("msg",
							"" + "<span style='color:green;'>Book Saved. sr.No. = " + saveBook.getId() + "</span>");
				} else {
					ru.addFlashAttribute("msg", "<span style='color:red;'>Error while saving data.</span>");
				}
			} catch (DataIntegrityViolationException e) {
				ru.addFlashAttribute("msg1", "<span style='color:red;'>Duplicate Book Name , entry not saved.</span>");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "redirect:/Book/AddBook";
		}

	}

	@GetMapping("LibraryStock")
	public String getALlList(Model model) {
		List<Book> books = new ArrayList<Book>();
		try {
			books = bookService.findAllBook();
			model.addAttribute("books", books);
		} catch (Exception e) {
			e.printStackTrace();
//			model.addAttribute("msg", "No data found");
		}
		return "libraryStock";

	}

	@PostMapping("deleteBook")
	public String deleteBook(@RequestParam("id") Long bookId, Model model, RedirectAttributes ru) {

		try {
			int del = bookService.deleteById(bookId);
			ru.addFlashAttribute("msg", "<span style='color:green;'>Detail Deleted Successfully !!</span>");
		} catch (Exception e) {
			e.printStackTrace();
			ru.addFlashAttribute("msg", "<span style='color:red;'>Error while Delet detail.</span>");
		}
		return "redirect:LibraryStock";
	}

	@PostMapping("editBook")
	public String editBook(@RequestParam("id") Long bookId, Model model) {
		try {
			Book book = bookService.findById(bookId);
			model.addAttribute("book", book);
			return "addBook";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "Something Went Wrong !!");
			return "redirect:LibraryStock";
		}

	
	}

	@GetMapping("searchBook")
	public String searchBook(Model model) {
//		List<Book> books= new ArrayList<Book>();
//		try {
//			books = bookService.findAllBook();
//		} catch (Exception e) {
//			e.printStackTrace();
//			model.addAttribute("msg","No data found");
//		}
//		
//		model.addAttribute("books",books);
		return "searchBook";

	}

}
