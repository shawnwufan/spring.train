package com.shawn.spring.train;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	@Test
	public void testHello() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ��ȡ���ݲ�����������ע���Bean
		Hello byIndex = beanFactory.getBean("byIndex", Hello.class);
		byIndex.sayHello();
		// ��ȡ���ݲ�����������ע���Bean
		Hello byType = beanFactory.getBean("byType", Hello.class);
		byType.sayHello();
		// ��ȡ���ݲ�����������ע���Bean
		Hello byName = beanFactory.getBean("byName", Hello.class);
		byName.sayHello();

	}

	@Test
	public void testHello2() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ��������ע���Bean
		Hello byIndex = beanFactory.getBean("setter", Hello.class);
		byIndex.sayHello();
	}

	@Test
	public void testList() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ��������ע��List
		ListTestBean ltb = beanFactory.getBean("getlist", ListTestBean.class);
		ltb.getList();
	}
	
	@Test
	public void testMap() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ��������ע��Map
		MapTestBean mtb = beanFactory.getBean("getmap", MapTestBean.class);
		mtb.getMap();
	}
	
	@Test
	public void testComplex() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ��������ע��Map
		ComplexBean cb = beanFactory.getBean("complex", ComplexBean.class);
		cb.getInfo();
	}
}