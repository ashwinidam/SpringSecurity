package com.scp.java.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class LoginKey implements Serializable {

	public String username;
	public String password;
	
	@Override
	public String toString() {
		return "LoginKey [username=" + username + ", password=" + password + "]";
	}
	
	public LoginKey(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public LoginKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
