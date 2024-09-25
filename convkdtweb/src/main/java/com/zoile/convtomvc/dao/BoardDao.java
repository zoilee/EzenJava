package com.zoile.convtomvc.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.zoile.convtomvc.model.BoardDto;



public interface BoardDao {
	int updateBoard(BoardDto dto) throws SQLException;
	int updateCount(long num) throws SQLException; //카운트 업데이트 updateBoard()메소드 오버로드
	int deleteBoard(long num) throws SQLException;
	int getTotalBoardCount() throws SQLException; // 전체 게시글 수를 가져옴
	ArrayList<BoardDto> listBoard(int limit, int recordsPerPage) throws SQLException; 
	BoardDto viewBoard(long num) throws SQLException;
	int insertBoard(BoardDto bbs) throws SQLException;
	int selectUserId(String userid, int num) throws SQLException;
	int isPass(long num, String pass) throws SQLException;
	ArrayList<BoardDto> searchBoard(String key, String val, int limit, int recordsPerPage) throws SQLException; 
	public int getsearchBoardCount(String key, String val) throws SQLException;
}
