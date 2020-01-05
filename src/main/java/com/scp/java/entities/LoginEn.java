package com.scp.java.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LoginEn {
		@EmbeddedId
		public LoginKey logKey;
		public int contactNo;
		public String fullName;
		public LoginEn() {
			super();
			// TODO Auto-generated constructor stub
		}
		public LoginEn(LoginKey logKey, int contactNo, String fullName) {
			super();
			this.logKey = logKey;
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
		

}
