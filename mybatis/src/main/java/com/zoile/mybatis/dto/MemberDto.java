package com.zoile.mybatis.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
	private int id;
	private String name;
	private String email;
	private Timestamp create_at;
}
