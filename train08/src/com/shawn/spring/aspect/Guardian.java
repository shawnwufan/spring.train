package com.shawn.spring.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class Guardian {
	@Pointcut("execution(* com.shawn.spring.service.Monkey.stealPeaches(..))")
	public void foundMonkey() {
	}

	@Before(value = "foundMonkey()")
	public void foundBefore() {
		System.out.println("���ػ��ߡ����ֺ������ڽ����԰...");
	}

	@AfterReturning("foundMonkey() && args(name,..)")
	public void foundAfter(String name) {
		System.out.println("���ػ��ߡ�ץס�˺���,�ػ������ʳ��˺��ӵ����ֽС�" + name + "��...");
	}
}
