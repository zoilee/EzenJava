package com.zoile.library.dao;

import java.util.List;

import com.zoile.library.model.BookDto;



public interface BookDao {

	int insert(BookDto dto);	//도서 추가
	BookDto getByBookId(int BookID);	//내용보기
	List<BookDto> getAll();	//목록보기
	int update(BookDto dto);	//수정하기
	int delete(int BookID);	//삭제하기

}
