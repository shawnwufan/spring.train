package com.shawn.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shawn.spring.service.Hello;

public class AopTest {
	@Test
	public void testHelloworld() {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			Hello hello = ctx.getBean("hello", Hello.class);
			// hello.sayHello();
//			hello.sayHelloByParam("Hello, my aop program!");
			hello.sayHelloReturning();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
