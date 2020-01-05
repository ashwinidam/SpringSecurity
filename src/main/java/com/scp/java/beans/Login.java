package com.scp.java.beans;
	
public class Login {
		public String userName;
		public String password;
		public String emailId;
		public int contactNo;
		public String fullName;
		
		
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Login(String userName, String password, String emailId, int contactNo, String fullName) {
			super();
			this.userName = userName;
			this.password = password;
			this.emailId = emailId;
			this.contactNo = contactNo;
			this.fullName = fullName;
		}
		@Override
		public String toString() {
			return "Login [userName=" + userName + ", password=" + password + ", emailId=" + emailId + ", contactNo="
					+ contactNo + ", fullName=" + fullName + "]";
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
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
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
		
		
		
	
	}
