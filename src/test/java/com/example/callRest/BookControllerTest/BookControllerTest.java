package com.example.callRest.BookControllerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.example.callRest.control.BookController;
import com.example.callRest.entity.Book;
import com.example.callRest.service.BookService;
import com.example.callRest.test.config.TestBeanConfig;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebAppConfiguration
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = { TestBeanConfig.class })
public class BookControllerTest {

//	@Autowired
//	@Mock
	private BookController bookController;

	@Autowired
	private BookService bookService;

	@Mock
    private Model model;
	
	
	@BeforeEach
	void setUp() {
		this.bookController  = new BookController();
	}
	
	
	@Test
	public void bookServiceTest() {
		
		
//		List<Book> findAllBook = bookService.findAllBook();
//		assertNotNull(findAllBook);
		model = new ConcurrentModel();
//		model.addAttribute("", "");
//		List<Book> books= new ArrayList<Book>();
//		books = bookService.findAllBook();
//		model.addAttribute("books",books);		
//		Model model = (Model) new HashMap<String, Object>();
		String result =  bookController.getALlList(model);
//		verify(model, never()).addAttribute("msg","No data found");
		assertNotNull(result);
		assertEquals(result, "LiberaryBook");
//		assertTrue(result.getBody().size() > 0);
//		LiberaryBook
	}

}
