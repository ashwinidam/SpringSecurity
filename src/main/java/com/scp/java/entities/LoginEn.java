package com.scp.java.entities;

import javax.persistence.EmbeddedId;

public class LoginEn {

		@EmbeddedId
		public LoginKey logKey;
		public String emailId;
		public int contactNo;
		public String fullName;
		public LoginEn() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public LoginEn(LoginKey logKey, String emailId, int contactNo, String fullName) {
			super();
			this.logKey = logKey;
			this.emailId = emailId;
			this.contactNo = contactNo;
			this.fullName = fullName;
		}
		@Override
		public String toString() {
			return "LoginEn [logKey=" + logKey + ", contactNo=" + contactNo + ", fullName=" + fullName + "]";
		}
		public LoginKey getLogKey() {
			return logKey;
		}
		public void setLogKey(LoginKey logKey) {
			this.logKey = logKey;
		}
		public int getContactNo() {
			return contactNo;
		}
		public void setContactNo(int contactNo) {
			this.contactNo = contactNo;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
	String userName;
	String password;
	public LoginEn(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
