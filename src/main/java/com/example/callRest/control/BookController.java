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
		//model.addAttribute("msg", null);
		return "addBook";

	}

	@PostMapping("/addBookDetails")
	public String addBookDetails(@ModelAttribute Book book, Model model, RedirectAttributes ru){
		try {
			Book saveBook = bookService.saveBook(book);
			if (saveBook != null) {
//				model.addAttribute("msg", "" + "<span style='color:green;'>Book Saved.</span>");
				ru.addFlashAttribute("msg", "" + "<span style='color:green;'>Book Saved. sr.No. = "+saveBook.getId()+"</span>");
			} else {
//				model.addAttribute("msg", "<span style='color:red;'>Error while saving Book.</span>");
				ru.addFlashAttribute("msg","<span style='color:red;'>Error while saving Book.</span>");

			}
		}catch (DataIntegrityViolationException e) {
		
			ru.addFlashAttribute("msg1","<span style='color:red;'>Duplicate Book entry not saved.</span>");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/Book/AddBook";
//		return "AddBook";
	}
	
	@GetMapping("LibraryBook")
	public String getALlList(Model model)
	{
		List<Book> books= new ArrayList<Book>();
		try {
			books = bookService.findAllBook();
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg","No data found");
		}
		
		model.addAttribute("books",books);
		return "libraryBook";
		
	}
	
	@PostMapping("deleteBook")
	public String deleteBook (@RequestParam("id")Long bookId, Model model){
		List<Book> books= new ArrayList<Book>();
		
		try {
			int del = bookService.deleteById (bookId);
			books = bookService.findAllBook();
			model.addAttribute("msg","Data deleted successfully !!");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg","No data found");
		}
		
		model.addAttribute("books",books);
		return "libraryBook";
		
	}
	
	
	
	
}
