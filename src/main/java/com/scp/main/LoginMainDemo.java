package com.scp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.scp.java.beans.Registration;
import com.scp.java.config.SpringHibernateConfig;
import com.scp.java.entities.RegistrationEn;
import com.scp.java.entities.LoginKey;
import com.scp.java.service.LoginService;

public class LoginMainDemo {

	public static void main(String[] args)
	{
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);
	LoginService service =(LoginService)context.getBean("service");
	
	System.out.println(service.hashCode());
	 System.out.println(service.getLogindao().hashCode() +">> DAOImpl");
	 System.out.println(service.getLogindao().getSfactory().hashCode());
	//LoginKey logk=new LoginKey("Ashwini","ashwini");
	// Registration login=new Registration("gita", "gitu", "asss@sss.com", 66666, "Gita Sunil");
	//service.addUser(login);
	//System.out.println("Added successfully");
	// Registration re=service.getUser("gita", "gitu");
	 //System.out.println(service.getAllUser());
	 //System.out.println(re);
}
}