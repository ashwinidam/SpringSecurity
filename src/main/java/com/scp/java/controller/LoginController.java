package com.scp.java.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.scp.java.beans.Login;
import com.scp.java.service.LoginService;


@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	LoginService service;

	public LoginService getService() {
		return service;
	}

	public void setService(LoginService service) {
		this.service = service;
	}
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ModelAndView showLogin() {
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("logbn",new Login());
		return new ModelAndView("register", model);
		
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("logbn") Login bean) {
		System.out.println(bean);
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("logbn",new Login());
	
		service.addUser(bean);
		String msg="added ssuccessfully";
		model.put("logbn",msg);
		return new ModelAndView("logbn",model);
	}

}
