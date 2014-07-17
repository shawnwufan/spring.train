package com.shawn.spring.train;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSePL2 {
	@Test
	public void test01() {
		try {
			BeanFactory bean = new ClassPathXmlApplicationContext("applicationContext.xml");
			User user = bean.getBean("myUser", User.class);
			System.out.println(user.getName() + " : " + user.getAge().toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void test02() {
		 ApplicationContext ctx = new
		 ClassPathXmlApplicationContext("applicationContext.xml");
		 User2 user = ctx.getBean("myUser2", User2.class);
		 System.out.println(user.getName() + " : " +user.getAge().toString());
	}
}
