package com.zoile.mybatis.dao;

import java.util.List;

import com.zoile.mybatis.dto.MemberDto;

public interface MemDao {
	List<MemberDto> getAllMembers();
	MemberDto getMember(int id);
	void createMember(MemberDto dto);
	void updateMember(MemberDto dto);
	void delMember(int id);
}
