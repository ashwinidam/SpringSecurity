package com.scp.java.service;

import com.scp.java.entities.RegistrationEn;
import com.scp.java.entities.LoginEn;
import com.scp.java.entities.LoginKey;
import com.scp.java.beans.Registration;
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

	public int addUser(Registration login) {
		RegistrationEn log=new RegistrationEn();
		log.setFullName(login.getFullName());
		log.setContactNo(login.getContactNo());
		log.setEmailId(login.getEmailId());
		LoginKey lk=new LoginKey();
		lk.setPassword(login.getPassword());
		lk.setUsername(login.getUserName());
		log.setLogKey(lk);
		System.out.println("In addUser before dao");
		try
		{
		logindao.daoAddUser(log);
		return 1;
		}
		catch(Exception e)
		{
			System.out.println("Registration failed");
			return -1;
		}
	}

	public Registration getUser(String userName, String password) {
		LoginKey lk=new LoginKey();
		lk.setUsername(userName);
		lk.setPassword(password);
		RegistrationEn re=new RegistrationEn();
		
		re=logindao.daoGetUser(lk);
		System.out.println(re);
		re.setLogKey(lk);
		
		Registration registerbean=new Registration();
		
		lk.setUsername(re.getLogKey().getUsername());
		lk.setPassword(re.getLogKey().getPassword());
		registerbean.setFullName(re.getFullName());
		registerbean.setContactNo(re.getContactNo());
		registerbean.setEmailId(re.getEmailId());
		registerbean.setUserName(lk.getUsername());
		registerbean.setPassword(lk.getPassword());
		return registerbean;
	}

	public int changePassword(String userName, String oldPassword, String newpassword) {
		
		return 0;
	}

	public int deleteUser(String userName, String password) {
		
		return 0;
	}

}
