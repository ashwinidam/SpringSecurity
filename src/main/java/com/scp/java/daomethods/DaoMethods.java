package com.scp.java.daomethods;

import com.scp.java.entities.LoginEn;
import com.scp.java.beans.Login;

public interface DaoMethods {
	public int daoAddUser(LoginEn login);
	public Login daoGetUser(String userName,String password);
	public int daoChangePassword(String userName,String oldPassword,String newpassword);
	public int daoDeleteUser(String userName,String password);
}
