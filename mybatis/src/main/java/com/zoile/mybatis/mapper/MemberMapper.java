package com.zoile.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.zoile.mybatis.dto.MemberDto;

@Mapper
public interface MemberMapper {
	
	// selectMem, listMem, insertMem, updateMem, deleteMem
	List<MemberDto> listMem();
	MemberDto selectMem(int id);
	void insertMem(MemberDto dto);
	void updateMem(MemberDto dto);
	void deleteMem(int id);
}
