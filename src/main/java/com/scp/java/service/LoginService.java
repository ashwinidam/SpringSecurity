package com.scp.java.service;

import com.scp.java.entities.LoginEn;
import com.scp.java.entities.LoginKey;
import com.scp.java.beans.Login;
import com.scp.java.dao.DaoLayer;
import com.scp.java.servicemethods.ServiceMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("service")
// This is my login service
// This message added for testing from my new branch fetch-user-details.
public class LoginService implements ServiceMethod{

	@Autowired 
	DaoLayer logindao;
	
	
	public DaoLayer getLogindao() {
		return logindao;
	}

	public void setLogindao(DaoLayer logindao) {
		this.logindao = logindao;
	}

	public int addUser(Login login) {
		LoginEn log=new LoginEn();
		log.setFullName(login.getFullName());
		log.setContactNo(login.getContactNo());
		LoginKey lk=new LoginKey();
		lk.setPassword(login.getPassword());
		lk.setUsername(login.getUserName());
		log.setLogKey(lk);
		logindao.daoAddUser(log);
		
		return 0;
	}

	public Login getUser(String userName, String password) {
		Login l=new Login();   
		LoginKey lk=new LoginKey();
		return l;
		
	}

	public int changePassword(String userName, String oldPassword, String newpassword) {
		
		return 0;
	}

	public int deleteUser(String userName, String password) {
		
		return 0;
	}

}
