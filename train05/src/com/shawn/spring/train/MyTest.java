package com.shawn.spring.train;

import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void compare() {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			HelloRandom helloRandom = (HelloRandom) context.getBean("helloRandom");
			System.out.println("��������ʵ��û�в��÷���ע��");
			Random r1 = helloRandom.getRandom();
			Random r2 = helloRandom.getRandom();
			System.out.println("Random ������ʵ���Ƿ�ָ��ͬһ�����ã�" + (r1 == r2));
			r1.printRandom();
			r2.printRandom();
			System.out.println();
			System.out.println("��������ʵ�����÷���ע��");
			Random r3 = helloRandom.createRandom();
			Random r4 = helloRandom.createRandom();
			System.out.println("Random ������ʵ���Ƿ�ָ��ͬһ�����ã�" + (r3 == r4));
			r3.printRandom();
			r4.printRandom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
