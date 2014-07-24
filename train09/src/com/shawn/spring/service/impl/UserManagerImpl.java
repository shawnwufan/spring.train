package com.shawn.spring.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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
		System.out.println(user.getName() + " ���ӳɹ�");

	}

	@Override
	public void delUser() {
		user.setName("shawn");
		System.out.println(user.getName() + " ɾ���ɹ�");

	}

	@PostConstruct
	public void init(){
		System.out.println("Bean��ʼ���ɹ�");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Bean���ٳɹ�");
	}
//	@Override
//	public void addUser() {
//		System.out.println("���ӳɹ�");
//
//	}
//
//	@Override
//	public void delUser() {
//		System.out.println("ɾ���ɹ�");
//
//	}
}
