package com.scp.java.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.scp.java.beans.Registration;
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
		model.put("logbn",new Registration());
		return new ModelAndView("register", model);
		
	}
	
	/* @RequestMapping(value = "/delete/{eid}",method = RequestMethod.GET)
	public ModelAndView empDelete(@PathVariable("eid") int empId) {
		service.deleteEmp(empId);
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("empbn",new Emp());
		model.put("employees",service.getAllEmps());
		return new ModelAndView("employee",model);
	} */
	
	@RequestMapping(value = "/home/{userName}/{password}",method = RequestMethod.GET)
	public ModelAndView showHome(@PathVariable String userName, @PathVariable String password) {
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("logbn", service.getUser(userName, password));
		return new ModelAndView("loginHome", model);
		
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("logbn") Registration bean) {
		System.out.println(bean);
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("logbn",new Registration());
	
		service.addUser(bean);
		String msg="added ssuccessfully";
		model.put("logbn",msg);
		return new ModelAndView("logbn",model);
	}

}
