package com.warmtel.springboot.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.warmtel.springboot.demo1.dao.UserDao;
import com.warmtel.springboot.demo1.model.User;

@Controller
@RequestMapping("/")
public class LoginController{
	@Autowired
	private UserDao userDao;

	@GetMapping("/html/{id}")
	public String getUserHtmlById(@PathVariable int id, Model model) {
		// User user = new User(id, "小明", 23);
		User user = userDao.findOne(id);
		model.addAttribute("user", user);
		return "index";
	}

	@GetMapping("/jsp/{id}")
	public String getUserJspById(@PathVariable int id, Model model) {
		// User user = new User(id, "小明", 23);
		User user = userDao.findOne(id);
		model.addAttribute("user", user);
		return "login";
	}
	@GetMapping("/test")
	public ModelAndView testJsp(){
		System.out.println("test>>>>");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		return mv;
	}
	
	
}