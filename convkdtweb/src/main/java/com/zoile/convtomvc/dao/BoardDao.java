package com.zoile.convtomvc.dao;

import java.sql.SQLException;
import java.util.ArrayList;



public interface BoardDao {
	int updateBoard(BoardDao dto) throws SQLException;
	int updateCount(long num) throws SQLException; //카운트 업데이트 updateBoard()메소드 오버로드
	int deleteBoard(long num) throws SQLException;
	int getTotalBoardCount() throws SQLException; // 전체 게시글 수를 가져옴
	ArrayList<BoardDao> listBoard(int limit, int recordsPerPage) throws SQLException; 
	BoardDao viewBoard(long num) throws SQLException;
	int insertBoard(BoardDao bbs) throws SQLException;
	int selectUserId(String userid, int num) throws SQLException;
	int isPass(long num, String pass) throws SQLException;
	ArrayList<BoardDao> searchBoard(String key, String val, int limit, int recordsPerPage) throws SQLException; 
	public int getsearchBoardCount(String key, String val) throws SQLException;
}
