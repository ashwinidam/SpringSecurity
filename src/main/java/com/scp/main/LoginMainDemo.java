package com.scp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.scp.java.beans.Login;
import com.scp.java.config.SpringHibernateConfig;
import com.scp.java.entities.LoginEn;
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
	// LoginKey logk=new LoginKey("Ashwini","ashwini","ashu@gmail.com");
	 Login login=new Login("Ashwini","ashwini","ashu@gmail.com",123456,"Ashwini Sarang");
	 service.addUser(login);
	 System.out.println("Added successfully");
}
}