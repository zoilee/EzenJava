package com.zoile.board.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zoile.board.model.BoardDto;


public interface BoardDao {
	int insert(BoardDto dto);	//글쓰기
	BoardDto getById(int id);	//내용보기
	List<BoardDto> getAll(int limit, int recordsPerPage);	//목록보기
	int update(BoardDto dto);	//수정하기
	int delete(int id);	//삭제하기
	int getTotalBoardCount() throws SQLException; // 전체 게시글 수를 가져옴
}
