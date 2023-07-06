package com.example.callRest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.callRest.entity.Book;

public interface BookDao extends JpaRepository<Book, Long> ,JpaSpecificationExecutor<Book>{

//	@Query(value = "SELECT * FROM book_data WHERE ?1 like '%?2%' ",
//			nativeQuery = true)
//	@Query("SELECT u FROM book_data u WHERE :searchDataField = :searchDataBy ")
//	List<Book> findBookbyRequest( @Param("searchDataField")String searchDataField,  @Param("searchDataBy")String searchDataBy);
	
//	List<Book> getAllBook();
	
	
	

}
