package com.zoile.convtomvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zoile.convtomvc.model.BoardDto;

public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int updateBoard(BoardDto dto) throws SQLException {
		String sql = "update bbs_bbs SET title =?, contents=?, writer=?, password=? where num =?";
		return jdbcTemplate.update(sql, dto.getTitle(), dto.getContents(), dto.getWriter(),dto.getPassword(),dto.getNum());
	}

	@Override
	public int updateCount(long num) throws SQLException {
		String sql = "update bbs_bbs set count=count+1 where num=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{num}, new BoardRowMapper());
	}

	@Override
	public int deleteBoard(long num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalBoardCount() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<BoardDto> listBoard(int limit, int recordsPerPage) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDto viewBoard(long num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(BoardDto bbs) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int selectUserId(String userid, int num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int isPass(long num, String pass) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<BoardDto> searchBoard(String key, String val, int limit, int recordsPerPage) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getsearchBoardCount(String key, String val) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static class BoardRowMapper implements RowMapper<BoardDto>{
		@Override
		public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardDto dto = new BoardDto();
			dto.setNum(rs.getLong("id"));
			dto.setTitle(rs.getString("title"));
			dto.setContents(rs.getString("Contents"));
			dto.setWriter(rs.getString("Writer"));
			dto.setCount(rs.getInt("count"));
			dto.setWdate(rs.getTimestamp("wdate"));
			dto.setUserid(rs.getString("userid"));
			dto.setPassword(rs.getString("password"));
			dto.setViewDate(rs.getString("viewDate"));
			
			return dto;
		}

}
