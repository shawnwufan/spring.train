package com.shawn.spring.impl;

import com.shawn.spring.service.Hello;

public class HelloImpl implements Hello {

	@Override
	public void sayHello() {
		System.out.println("ÄãºÃ");
	}

	@Override
	public void sayHelloByParam(String msg) {
		System.out.println(msg);

	}

	@Override
	public String sayHelloReturning() {
		String msg = "Hello, this is my test app!";
		System.out.println(msg);
		return msg;
	}

}
