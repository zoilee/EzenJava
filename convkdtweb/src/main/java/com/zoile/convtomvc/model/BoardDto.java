package com.zoile.convtomvc.model;

import java.sql.Timestamp;

public class BoardDto {
	private long num;
	private String title;
	private String contents;
	private String writer;
	private int count;
	private Timestamp wdate;
	private String userid;
	private String password;
	private String viewDate;
	public BoardDto(long num, String title, String contents, String writer, int count, Timestamp wdate, String userid,
			String password, String viewDate) {
		super();
		this.num = num;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.count = count;
		this.wdate = wdate;
		this.userid = userid;
		this.password = password;
		this.viewDate = viewDate;
	}
	@Override
	public String toString() {
		return "BoardDto [num=" + num + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", count=" + count + ", wdate=" + wdate + ", userid=" + userid + ", password=" + password
				+ ", viewDate=" + viewDate + "]";
	}
	
}
