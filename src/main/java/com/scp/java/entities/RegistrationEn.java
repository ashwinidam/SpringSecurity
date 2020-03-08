package com.scp.java.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Registartion running now
@Entity
@Table
public class RegistrationEn {
		@EmbeddedId
		public LoginKey logKey;
		public int contactNo;
		public String fullName;
		public String emailId;
		public RegistrationEn() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public RegistrationEn(LoginKey logKey, int contactNo, String fullName, String emailId) {
			super();
			this.logKey = logKey;
			this.contactNo = contactNo;
			this.fullName = fullName;
			this.emailId = emailId;
		}

		@Override
		public String toString() {
			return "RegistrationEn [logKey=" + logKey + ", contactNo=" + contactNo + ", fullName=" + fullName
					+ ", emailId=" + emailId + "]";
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
		

}
