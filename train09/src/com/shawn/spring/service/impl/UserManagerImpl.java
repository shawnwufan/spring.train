package com.shawn.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shawn.spring.model.User;
import com.shawn.spring.service.UserManager;

@Service
public class UserManagerImpl implements UserManager {
	@Resource  
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void addUser() {
		user.setName("shawn");
		System.out.println(user.getName() + " 增加成功");

	}

	@Override
	public void delUser() {
		user.setName("shawn");
		System.out.println(user.getName() + " 删除成功");

	}

//	@Override
//	public void addUser() {
//		System.out.println("增加成功");
//
//	}
//
//	@Override
//	public void delUser() {
//		System.out.println("删除成功");
//
//	}
}
