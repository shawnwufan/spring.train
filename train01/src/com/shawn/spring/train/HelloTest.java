package com.shawn.spring.train;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	@Test
	public void testHello() {
		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		Hello hello = context.getBean("hello", Hello.class);
		// 3、执行业务逻辑
		hello.sayHello();
	}

	@Test
	public void testHello2() {
		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		Hello hello = context.getBean("hello2", Hello.class);
		// 3、执行业务逻辑
		hello.sayHello();
	}

	@Test
	public void testHello3() {
		// 使用静态工厂方法
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = context.getBean("hello3", Hello.class);
		hello.sayHello();

	}
}
