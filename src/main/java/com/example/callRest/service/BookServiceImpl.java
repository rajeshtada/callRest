package com.example.callRest.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.callRest.VoClass.BookDetailVo;
import com.example.callRest.dao.BookDao;
import com.example.callRest.dao.BookSpecification;
import com.example.callRest.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	public BookDao bookDao;

	@Override
	public List<Book> findAllBook() {
		List<Book> allBookList = bookDao.findAll();
		return allBookList;
	}

	@Override
	public Book saveBook(Book book) {
		Book books = bookDao.save(book);
		return books;
	}

	@Override
	public Book findById(Long Id) {
		Book book = bookDao.findById(Id).get();
		return null;
	}

	@Override
	public int deleteById(Long bookId) {
		try {
			bookDao.deleteById(bookId);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public List<BookDetailVo> findBookbyRequest(BookDetailVo bookRequestVo) {

		ModelMapper modelMapper = new ModelMapper();

		List<BookDetailVo> listBookVo = new ArrayList<>();
		try {

//			List<Book> listBook = bookDao.findBookbyRequest(bookRequestVo.getSearchDataField() , bookRequestVo.getSearchDataBy());
			
			BookSpecification bs = new BookSpecification(bookRequestVo.getSearchDataField() , bookRequestVo.getSearchDataBy());
			List<Book> listBook = bookDao.findAll(bs);
			

			Type classBookDetailVo = new TypeToken<List<BookDetailVo>>() {
			}.getType();
			listBookVo = modelMapper.map(listBook, classBookDetailVo);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listBookVo;
	}

}
