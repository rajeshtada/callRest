package com.example.callRest.VoClass;

import java.util.List;

public class BookDetailVo {
	
	private Long id;

	private String bookName;

	private String writer;
	
	private Long price;
	
	private String description;
	
	private String searchDataBy;
	
	private String searchDataField;
	
	private int status;
	
	private String message;
	
	List<BookDetailVo> listBookDetailVo;
	

	public List<BookDetailVo> getListBookDetailVo() {
		return listBookDetailVo;
	}

	public void setListBookDetailVo(List<BookDetailVo> listBookDetailVo) {
		this.listBookDetailVo = listBookDetailVo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSearchDataBy() {
		return searchDataBy;
	}

	public void setSearchDataBy(String searchDataBy) {
		this.searchDataBy = searchDataBy;
	}

	public String getSearchDataField() {
		return searchDataField;
	}

	public void setSearchDataField(String searchDataField) {
		this.searchDataField = searchDataField;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		return "BookDetailVo [id=" + id + ", bookName=" + bookName + ", writer=" + writer + ", price=" + price
				+ ", description=" + description + ", searchDataBy=" + searchDataBy + ", searchDataField="
				+ searchDataField + ", status=" + status + ", message=" + message + ", listBookDetailVo="
				+ listBookDetailVo + "]";
	}
	
	
	
	
}
