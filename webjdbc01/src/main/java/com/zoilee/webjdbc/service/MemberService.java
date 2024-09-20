package com.zoilee.webjdbc.service;

import org.springframework.ui.Model;

import com.zoilee.webjdbc.model.MemberDto;

public interface MemberService {
	int insertMem(MemberDto dto);
	void getMemByNum(int num, Model model);
	void getAllMem(Model model);
	int updateMem(MemberDto dto);
	int delMem(int num);
}
