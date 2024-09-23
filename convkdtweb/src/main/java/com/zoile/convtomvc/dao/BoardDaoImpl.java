package com.zoile.convtomvc.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDaoImpl implements BoardDao {

	@Override
	public int updateBoard(BoardDao dto) throws SQLException {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int updateCount(long num) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
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
	public ArrayList<BoardDao> listBoard(int limit, int recordsPerPage) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDao viewBoard(long num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(BoardDao bbs) throws SQLException {
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
	public ArrayList<BoardDao> searchBoard(String key, String val, int limit, int recordsPerPage) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getsearchBoardCount(String key, String val) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
