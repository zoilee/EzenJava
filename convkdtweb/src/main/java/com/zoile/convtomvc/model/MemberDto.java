package com.zoile.convtomvc.model;

import java.sql.Timestamp;

public class MemberDto {
	
	   private int id;	
	   private String userid;	
	   private String userpass;
	   private String username;
	   private String useremail;
	   private String usertel;
	   private int userpost;
	   private String useraddr1;
	   private String useraddr2;
	   private String useraddrexc;
	   private Timestamp rdate;
	   private int grade;
	public MemberDto(int id, String userid, String userpass, String username, String useremail, String usertel,
			int userpost, String useraddr1, String useraddr2, String useraddrexc, Timestamp rdate, int grade) {
		super();
		this.id = id;
		this.userid = userid;
		this.userpass = userpass;
		this.username = username;
		this.useremail = useremail;
		this.usertel = usertel;
		this.userpost = userpost;
		this.useraddr1 = useraddr1;
		this.useraddr2 = useraddr2;
		this.useraddrexc = useraddrexc;
		this.rdate = rdate;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", userid=" + userid + ", userpass=" + userpass + ", username=" + username
				+ ", useremail=" + useremail + ", usertel=" + usertel + ", userpost=" + userpost + ", useraddr1="
				+ useraddr1 + ", useraddr2=" + useraddr2 + ", useraddrexc=" + useraddrexc + ", rdate=" + rdate
				+ ", grade=" + grade + "]";
	}
	
}
