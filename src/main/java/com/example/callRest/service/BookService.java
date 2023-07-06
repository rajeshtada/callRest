package com.example.callRest.service;

import java.util.List;

import com.example.callRest.VoClass.BookDetailVo;
import com.example.callRest.entity.Book;


public interface BookService {

	/**
	 * (this is find all method with null parameter that return all list of Books in
	 * Library).
	 * @author rajesh - Rajesh Tada
	 */
	List<Book> findAllBook();

	Book saveBook(Book book);

	Book findById(Long Id);

	int deleteById(Long bookId);

	/**
	 * (this is find method with given  parameter that return  list of Books in
	 * Library).
	 * 
	 * @author rajesh - Rajesh Tada
	 */
	List<BookDetailVo> findBookbyRequest(BookDetailVo bookRequestVo);
	

}
