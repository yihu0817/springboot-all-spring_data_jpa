package com.warmtel.springboot.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warmtel.springboot.demo1.dao.UserDao;
import com.warmtel.springboot.demo1.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserDao userDao;

	@RequestMapping("/")
	String home() {
		return "Hello World1!";
	}

	@RequestMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		// User user = new User(id, "小明", 23);
		User user = userDao.findOne(id);
		return user;
	}

	@RequestMapping("/add/{id}/{name}/{age}")
	public User getUserAll(@PathVariable int id, @PathVariable String name, @PathVariable int age) {
		User user = new User(id, name, age);
		userDao.save(user);
		return user;
	}
}