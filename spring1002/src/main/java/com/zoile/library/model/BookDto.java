package com.zoile.library.model;


import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


public class BookDto {

	private int bookId;
	private String title;
	private String author;
	private String publisher;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate publishedDate;
	
	private String ISBN;
	private String genre;
	private int price;
	private int stock;
	public BookDto(){}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "BookDto [BookID=" + bookId + ", Title=" + title + ", Author=" + author + ", Publisher=" + publisher
				+ ", PublishedDate=" + publishedDate + ", ISBN=" + ISBN + ", Genre=" + genre + ", Price=" + price
				+ ", Stock=" + stock + "]";
	}
}
