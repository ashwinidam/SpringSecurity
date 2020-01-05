package com.scp.java.entities;

public class LoginEn {
	String userName;
	String password;
	public LoginEn(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public LoginEn() {
		super();
		
	}
	@Override
	public String toString() {
		return "LoginEn [userName=" + userName + ", password=" + password + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
