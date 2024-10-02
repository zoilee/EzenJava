package com.zoile.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.zoile.board.dao.BoardDao;
import com.zoile.board.model.BoardDto;


@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao dao;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertBoard(BoardDto dto) {
		
		return dao.insert(dto);
	}

	@Override
	public void getBoardById(int id, Model model) {
		BoardDto dto = dao.getById(id);
		model.addAttribute("board", dto);
	}

	@Override
	public List<BoardDto> getAllBoard(int limit, int recordsPerPage ) {
		 return dao.getAll(limit, recordsPerPage);

	}

	
	@Override
	public int updateBoard(BoardDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delBoard(int id) {
		return dao.delete(id);
	}
	@Override
	public int getTotalBoardCount() {
	    String sql = "SELECT COUNT(*) FROM board";
	    return jdbcTemplate.queryForObject(sql, Integer.class);
	}

}
