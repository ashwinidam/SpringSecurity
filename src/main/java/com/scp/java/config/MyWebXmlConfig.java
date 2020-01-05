package com.scp.java.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



public class MyWebXmlConfig implements WebApplicationInitializer{

	static {
		System.out.println("inside xml configuration file");
	}

public void onStartup(ServletContext servletContext) throws ServletException {
	 	AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        webCtx.register(SpringHibernateConfig.class);
        webCtx.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet = 
        		servletContext.addServlet("dispatcher", new DispatcherServlet(webCtx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");		
}
}
