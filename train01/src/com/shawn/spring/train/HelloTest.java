package com.shawn.spring.train;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	@Test
	public void testHello() {
		// 1����ȡ�����ļ�ʵ����һ��IoC����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2���������л�ȡBean��ע��˴���ȫ������ӿڱ�̣�����������ʵ�֡�
		Hello hello = context.getBean("hello", Hello.class);
		// 3��ִ��ҵ���߼�
		hello.sayHello();
	}

	@Test
	public void testHello2() {
		// 1����ȡ�����ļ�ʵ����һ��IoC����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2���������л�ȡBean��ע��˴���ȫ������ӿڱ�̣�����������ʵ�֡�
		Hello hello = context.getBean("hello2", Hello.class);
		// 3��ִ��ҵ���߼�
		hello.sayHello();
	}

	@Test
	public void testHello3() {
		// ʹ�þ�̬��������
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = context.getBean("hello3", Hello.class);
		hello.sayHello();

	}
}
