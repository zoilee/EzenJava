package com.zoilee.webjdbc.model;

import java.sql.Timestamp;

public class MemberDto {
	private int num;
	private String name;
	private String email;
	private Timestamp create_at;
	
	public MemberDto(){}
	
	public MemberDto(int num, String name, String email, Timestamp create_at) {
		this.num = num;
		this.name = name;
		this.email = email;
		this.create_at = create_at;
	}
	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Timestamp getCreate_at() {
		return create_at;
	}


	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}

	@Override
	public String toString() {
		return "MemberDto [num=" + num + ", name=" + name + ", email=" + email + ", create_at=" + create_at + "]";
	}

	

}
