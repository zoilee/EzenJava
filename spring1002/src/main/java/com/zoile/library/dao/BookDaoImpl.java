package com.zoile.library.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zoile.library.model.BookDto;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(BookDto dto) {
		String sql = "INSERT INTO books (title, author, publisher, publisheddate, isbn, genre, price, stock) VALUES (?,?,?,?,?,?,?,?)";
		
		return jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(), dto.getPublisher(), Date.valueOf(dto.getPublishedDate()), dto.getISBN(), dto.getGenre(), dto.getPrice(), dto.getStock());
	}

	@Override
	public BookDto getByBookId(int BookID) {
		String sql = "select * from books where bookid = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{BookID}, new BookRowMapper());
	}
	

	@Override
	public List<BookDto> getAll() {
		String sql = "select * from books order by bookid desc";
		return jdbcTemplate.query(sql, new BookRowMapper());
	}
	

	@Override
	public int update(BookDto dto) {
		String sql = "update books set title=?, author=?, publisher=?, publisheddate=?, isbn=?, genre=?, price=?, stock=? where bookid = ?";
		return jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(), dto.getPublisher(), Date.valueOf(dto.getPublishedDate()), dto.getISBN(), dto.getGenre(), dto.getPrice(), dto.getStock(), dto.getBookId());
	}

	@Override
	public int delete(int BookID) {
		String sql = "delete from books where bookid=?";
		return jdbcTemplate.update(sql, BookID);
	}
	
	private static class BookRowMapper implements RowMapper<BookDto>{

		@Override
		public BookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BookDto dto = new BookDto();
			dto.setBookId(rs.getInt("bookid"));
			dto.setTitle(rs.getString("title"));
			dto.setAuthor(rs.getString("author"));
			dto.setPublisher(rs.getString("publisher"));
			Date publishedDate = rs.getDate("publisheddate");
			dto.setPublishedDate(publishedDate.toLocalDate());
			dto.setISBN(rs.getString("isbn"));
			dto.setGenre(rs.getString("genre"));
			dto.setPrice(rs.getInt("price"));
			dto.setStock(rs.getInt("stock"));	
			return dto;
		}
	}

}
