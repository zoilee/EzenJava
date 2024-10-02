package com.zoile.library.service;

import org.springframework.ui.Model;

import com.zoile.library.model.BookDto;



public interface BookService {
	int insertBook(BookDto dto);
	void getBookByid(int BookId, Model model);
	void getAllBook(Model model);
	int updateBook(BookDto dto);
	int delBook(int BookId);
}
