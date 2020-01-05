package com.scp.java.servicemethods;

import com.scp.java.entities.LoginEn;
import com.scp.java.beans.Login;

public interface ServiceMethod {
public int addUser(Login login);
public Login getUser(String userName,String password);
public int changePassword(String userName,String oldPassword,String newpassword);
public int deleteUser(String userName,String password);
}
