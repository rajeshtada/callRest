package com.example.callRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "book_data")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	@Column(name = "Book_Name" , unique=true)
	public String bookName;

	@Column(name = "writer")
	public String writer;
	
	@Column(name = "price")
	public Long price;
	
	@Column(name = "description")
	public String description;
	


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", writer=" + writer + ", price=" + price + ", description="
				+ description + "]";
	}

}
