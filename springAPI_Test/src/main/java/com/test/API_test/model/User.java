package com.test.API_test.model;

public class User {

	private String user_id;
	private String user_Nm;
	private String user_mail;
	private String Re;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_Nm() {
		return user_Nm;
	}

	public void setUser_Nm(String user_Nm) {
		this.user_Nm = user_Nm;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}

	public String getRe() {
		return Re;
	}

	public void setRe(String re) {
		Re = re;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_Nm=" + user_Nm + ", user_mail=" + user_mail + ", Re=" + Re + "]";
	}

}
