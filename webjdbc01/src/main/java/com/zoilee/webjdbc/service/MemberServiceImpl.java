package com.zoilee.webjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.zoilee.webjdbc.dao.MemberDao;
import com.zoilee.webjdbc.model.MemberDto;

@Service
public class MemberServiceImpl implements MemberService{



	@Autowired
	private MemberDao dao;

	
	@Override
	public int insertMem(MemberDto dto) {

		return dao.insert(dto);
	}

	@Override
	public void getMemByNum(int num, Model model) {
		MemberDto dto = dao.getByNum(num);
		model.addAttribute("mem", dto);
	}

	@Override
	public void getAllMem(Model model) {
		
		List<MemberDto> dtos = dao.getAll();
		model.addAttribute("list", dtos);
	}

	@Override
	public int updateMem(MemberDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delMem(int num) {
		
		return dao.delete(num);
	}

}
