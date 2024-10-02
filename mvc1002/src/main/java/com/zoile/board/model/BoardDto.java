package com.zoile.board.model;

import java.sql.Timestamp;

public class BoardDto {
	private int id;
	private String title;
	private String content;
	private String writer;
	private Timestamp create_at;
	private String viewDate;
	

	public BoardDto(){}

	public BoardDto(int id, String title, String content, String writer, Timestamp create_at) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.create_at = create_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Timestamp getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}
	public String getViewDate() {
		return viewDate;
	}

	public void setViewDate(String viewDate) {
		this.viewDate = viewDate;
	}

	@Override
	public String toString() {
		return "BoardDto [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", create_at=" + create_at + "]";
	}
	


	

}
