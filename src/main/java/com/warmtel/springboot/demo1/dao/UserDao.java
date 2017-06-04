package com.warmtel.springboot.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warmtel.springboot.demo1.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
