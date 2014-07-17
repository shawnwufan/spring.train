package com.shawn.spring.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class Guardian {
	@Pointcut("execution(* com.shawn.spring.service.Monkey.stealPeaches(..))")
	public void foundMonkey() {
	}

	@Before(value = "foundMonkey()")
	public void foundBefore() {
		System.out.println("【守护者】发现猴子正在进入果园...");
	}

	@AfterReturning("foundMonkey() && args(name,..)")
	public void foundAfter(String name) {
		System.out.println("【守护者】抓住了猴子,守护者审问出了猴子的名字叫“" + name + "”...");
	}
}
