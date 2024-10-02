package com.zoile.board.service;

import java.util.List;

import org.springframework.ui.Model;

import com.zoile.board.model.BoardDto;

public interface BoardService {
	int insertBoard(BoardDto dto);
	void getBoardById(int id, Model model);
	List<BoardDto> getAllBoard(int limit, int recordsPerPage);
	int updateBoard(BoardDto dto);
	int delBoard(int id);
	int getTotalBoardCount();
}
