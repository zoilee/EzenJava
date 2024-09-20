package com.zoilee.webjdbc.dao;

import java.util.List;

import com.zoilee.webjdbc.model.MemberDto;

//db접속 방법을 지정

public interface MemberDao {
	
	int insert(MemberDto dto);	//글쓰기
	MemberDto getByNum(int num);	//내용보기
	List<MemberDto> getAll();	//목록보기
	int update(MemberDto dto);	//수정하기
	int delete(int num);	//삭제하기

}
