package com.zoile.convtomvc.service;

import org.springframework.ui.Model;

import com.zoile.convtomvc.model.MemberDto;


public interface MemberService {
		int insertMem(MemberDto dto);
		void getMemByNum(int num, Model model);
		void getAllMem(Model model);
		int updateMem(MemberDto dto);
		int delMem(int num);


}
