package com.scp.java.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scp.java.entities.LoginKey;
import com.scp.java.entities.RegistrationEn;
import com.scp.java.beans.Registration;
import com.scp.java.daomethods.DaoMethods;

@Repository

public class DaoLayer implements DaoMethods{

	@Autowired
	SessionFactory sfactory;
	
	
	public SessionFactory getSfactory() {
		return sfactory;
	}

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	public int daoAddUser(RegistrationEn login) {
		System.out.println(login);
		Session session=null;
		Transaction tr=null;
		try
		{
			System.out.println("in try");
			session=sfactory.openSession();
			tr=session.beginTransaction();
			System.out.println("After transaction");
			int r=(Integer) session.save(login);
			System.out.println("Employee login details saved...");
			return r;
		}
		catch(Exception e)
		{
			return 0;
		}
		finally
		{
			session.flush();
			tr.commit();
		}
		
		
	}

	public RegistrationEn daoGetUser(LoginKey lk) {
	
		Session session=null;
		try
		{
			System.out.println("in try");
			session=sfactory.openSession();
			
			System.out.println("After transaction");
			RegistrationEn reent=session.get(RegistrationEn.class, lk);
			System.out.println("Employee login details fetched.."+reent);
			return reent;
		}
		catch(Exception e)
		{
			return null;
		}
		finally
		{
			session.close();
			
		}
		
		
	}

	public int daoChangePassword(String userName, String oldPassword, String newpassword) {
		
		return 0;
	}

	public int daoDeleteUser(String userName, String password) {
		
		return 0;
	}

	public List<RegistrationEn> daoGetAllUser() {
		Session session=null;
		try
		{
			System.out.println("in try");
			session=sfactory.openSession();
			Transaction tr=null;
			System.out.println("After transaction");
			return session.createCriteria(RegistrationEn.class).list();
		}
		catch(Exception e)
		{
			return null;
		}
		finally
		{
			session.close();
			
		}
	}

}
