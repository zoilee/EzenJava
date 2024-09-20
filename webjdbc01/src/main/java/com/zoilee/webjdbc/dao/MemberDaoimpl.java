package com.zoilee.webjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zoilee.webjdbc.model.MemberDto;

@Repository
public class MemberDaoimpl implements MemberDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(MemberDto dto) {
		String sql = "INSERT INTO member (name, email) VALUES (?,?)";
				
		return jdbcTemplate.update(sql, dto.getName(), dto.getEmail());
	}

	@Override
	public MemberDto getByNum(int num) {
		String sql = "select * from member where id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{num}, new MemRowMapper());
	}

	@Override
	public List<MemberDto> getAll() {
		String sql = "select * from member order by id desc";
		return jdbcTemplate.query(sql, new MemRowMapper());
	}

	@Override
	public int update(MemberDto dto) {
		String sql = "update member set name=?, email=? where id = ?";
		return jdbcTemplate.update(sql, dto.getName(), dto.getEmail(), dto.getNum());
	}

	@Override
	public int delete(int num) {
		String sql = "delete from member where id=?";
		return jdbcTemplate.update(sql, num);
	}
	
	private static class MemRowMapper implements RowMapper<MemberDto>{

		@Override
		public MemberDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberDto dto = new MemberDto();
			dto.setNum(rs.getInt("id"));
			dto.setName(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
			dto.setCreate_at(rs.getTimestamp("create_at"));
			
			return dto;
		}
		
	}
	
}
