package com.zoile.mybatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoile.mybatis.dto.MemberDto;
import com.zoile.mybatis.mapper.MemberMapper;

@Service
public class MemDaoImpl implements MemDao {

	@Autowired
	private MemberMapper memberMapper;
	

	
	@Override
	public List<MemberDto> getAllMembers() {
		// TODO Auto-generated method stub
		return memberMapper.listMem();
	}

	@Override
	public MemberDto getMember(int id) {
		// TODO Auto-generated method stub
		return memberMapper.selectMem(id);
	}

	@Override
	public void createMember(MemberDto dto) {
		memberMapper.insertMem(dto);

	}

	@Override
	public void updateMember(MemberDto dto) {
		memberMapper.updateMem(dto);

	}

	@Override
	public void delMember(int id) {
		memberMapper.deleteMem(id);

	}

}
