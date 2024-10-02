package com.zoile.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.zoile.library.dao.BookDao;
import com.zoile.library.model.BookDto;

@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookDao dao;
	
	@Override
	public int insertBook(BookDto dto) {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}

	@Override
	public void getBookByid(int BookId, Model model) {
		BookDto dto = dao.getByBookId(BookId);
		model.addAttribute("book", dto);

	}

	@Override
	public void getAllBook(Model model) {

		List<BookDto> dtos = dao.getAll();
		model.addAttribute("list", dtos);

	}

	@Override
	public int updateBook(BookDto dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}

	@Override
	public int delBook(int BookId) {
		// TODO Auto-generated method stub
		return dao.delete(BookId);
	}

}
