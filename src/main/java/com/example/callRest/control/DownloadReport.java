package com.example.callRest.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.callRest.entity.Book;
import com.example.callRest.service.BookService;
import com.example.callRest.service.BookServiceImpl;
import com.example.callRest.utils.DatabaseToExcel;
import com.example.callRest.utils.DatabaseToPDF;

@Controller
@RequestMapping("download")
public class DownloadReport {

	@Autowired
	public BookService bookService;

	@Autowired
	public BookServiceImpl bookServiceImpl;

	@RequestMapping(value = "/file", method = RequestMethod.GET)
	public String downloadFile() {

		return "downloadDataPage";
	}

	@PostMapping("pdfDownload")
	public String pdfDownload(RedirectAttributes ru) {
		List<Book> bookList= new ArrayList<Book>();
		bookList = bookService.findAllBook();
		DatabaseToPDF dtp = new DatabaseToPDF();
		String data = dtp.generatePdf(bookList);
		if (data!=null) {
			ru.addFlashAttribute("message", data);
		} else {
			ru.addFlashAttribute("message", "Error in File Downloading");

		}
		return "redirect:file";
	}
	@PostMapping("excelDownload")
	public String excelDownload(RedirectAttributes ru) {

		DatabaseToExcel dte = new DatabaseToExcel();
		try {
			String data = dte.generateExcel();
			if (data!=null) {
				ru.addFlashAttribute("message", data);

			}	else {
				ru.addFlashAttribute("message", "Error in File Downloading !!");

			}		
		} catch (Exception e) {
			e.printStackTrace();
			ru.addFlashAttribute("message", "Something went wrong Pls try again !!");

		}
		return "redirect:/download/file";
	}
	
	@RequestMapping(value = "/testHtmlPage", method = RequestMethod.GET)
	public String testHtmlPage() {

		return "testHtmlPage";
	}
	
}
