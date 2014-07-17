package com.shawn.spring.test;

import org.junit.Test;
import org.springframework.context.*;
import org.springframework.context.support.*;

import com.shawn.spring.service.Monkey;

public class MyTest {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Monkey monkey = (Monkey) context.getBean("monkey", Monkey.class);
		try {
			monkey.stealPeaches("Ëï´óÊ¥µÄ´óÍ½µÜ");
		} catch (Exception e) {
		}
	}
}
