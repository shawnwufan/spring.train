package com.shawn.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shawn.spring.service.UserManager;

public class MyTest {
	@Test
	public void test() {
		try{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserManager userManager = (UserManager) context.getBean("userManagerImpl");
		userManager.addUser();
		userManager.delUser();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
