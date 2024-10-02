package com.zoile.board.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zoile.board.model.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(BoardDto dto) {
		String sql = "INSERT INTO board (title, content, writer) VALUES (?,?,?)";
		
		return jdbcTemplate.update(sql, dto.getTitle(), dto.getContent(), dto.getWriter());
	}

	@Override
	public BoardDto getById(int id) {
		String sql = "select * from board where id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BoardRowMapper());
	}
	
	@Override
	public List<BoardDto> getAll(int limit, int recordsPerPage) {
	    String sql = "SELECT * FROM board ORDER BY id DESC LIMIT " + limit + ", " + recordsPerPage;
	    return jdbcTemplate.query(sql, new BoardRowMapper());
	}

	@Override
	public int update(BoardDto dto) {
		String sql = "update board set title=?, content=?, writer=?, created_at=? where id = ?";
		return jdbcTemplate.update(sql, dto.getTitle(), dto.getContent(), dto.getWriter(), new Timestamp(System.currentTimeMillis()), dto.getId());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from board where id=?";
		return jdbcTemplate.update(sql, id);
	}
	@Override
	public int getTotalBoardCount() throws SQLException {
		int totalRecords = 0;
		String sql = "select count(*) as total from board";
		
		
		return totalRecords;
	}
	
	
	private static class BoardRowMapper implements RowMapper<BoardDto>{

		@Override
		public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardDto dto = new BoardDto();
			dto.setId(rs.getInt("id"));
			dto.setTitle(rs.getString("title"));
			dto.setContent(rs.getString("content"));
			dto.setWriter(rs.getString("writer"));
			dto.setCreate_at(rs.getTimestamp("created_at"));	
			  //1. 출력은 yyyy-mm-dd 이렇게 24시간 이내의 글은 mm-dd 
            Timestamp wdate = rs.getTimestamp("created_at");  
            //wdate를 unix 타임으로 변환
            long wdateMills = wdate.getTime();
            
            //현재 시간을 unix 타임으로 가져옴
            long currentTimeMills = System.currentTimeMillis();
            
            //현재시간에서 글쓴 시간을 빼서 24시간 이내인지 확인
            long diffTime = currentTimeMills - wdateMills;
            long rsDiffTime = diffTime/(60 * 60* 1000); //시간단위로 변환
            
            SimpleDateFormat dateFormat;
            if(rsDiffTime < 24) {
               dateFormat = new SimpleDateFormat("HH:mm");
            }else {
               dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            dto.setViewDate(dateFormat.format(new Date(wdateMills)));
			return dto;
		}
		
	}
	
}
