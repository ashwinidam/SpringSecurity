package com.scp.java.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = {"com.scp.java.*"})
public class SpringHibernateConfig {
		
	static {
		System.out.println("inside spring hibernate integration");
	}
	
	@Bean("ds")
	public BasicDataSource basicDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/jvdb1");
		ds.setUsername("root");
		ds.setPassword("");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}
	
	@Bean("sfactory")
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean ls = new LocalSessionFactoryBean();
		ls.setDataSource(basicDataSource());
		ls.setHibernateProperties(initializeHibernateProps());
		ls.setPackagesToScan("com.scp.java.entities");
		return ls;
	}
	
	private Properties initializeHibernateProps() {
		Properties props =new Properties();
		props.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		props.put(Environment.HBM2DDL_AUTO,"update");
		props.put(Environment.SHOW_SQL,"true");
		return props;
	}
	
	@Bean
	public InternalResourceViewResolver prepareViewResoulver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setViewClass(JstlView.class);
		view.setPrefix("/WEB-INF/pages/");
		view.setSuffix(".jsp");
		return view;
	}
	
	
}
