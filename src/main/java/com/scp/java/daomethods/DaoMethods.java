package com.scp.java.daomethods;

import com.scp.java.entities.LoginKey;
import com.scp.java.entities.RegistrationEn;

import java.util.List;

import com.scp.java.beans.Registration;

public interface DaoMethods {
	public int daoAddUser(RegistrationEn login);
	public RegistrationEn daoGetUser(LoginKey lk);
	public List<RegistrationEn> daoGetAllUser();
	public int daoChangePassword(String userName,String oldPassword,String newpassword);
	public int daoDeleteUser(String userName,String password);
}
