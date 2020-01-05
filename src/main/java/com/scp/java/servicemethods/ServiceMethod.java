package com.scp.java.servicemethods;

import com.scp.java.entities.RegistrationEn;
import com.scp.java.beans.Registration;

public interface ServiceMethod {
public int addUser(Registration login);
public Registration getUser(String userName,String password);
public int changePassword(String userName,String oldPassword,String newpassword);
public int deleteUser(String userName,String password);
}
