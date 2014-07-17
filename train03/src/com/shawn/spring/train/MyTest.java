package com.shawn.spring.train;

import java.io.IOException;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void testDependOn() throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// һ��Ҫע�����ٻص����������Ƕ�������ٷ�����ִ��
		context.registerShutdownHook();
		DependentBean dependentBean = context.getBean("dependentBean", DependentBean.class);
		dependentBean.write("aaa");
	}
}
