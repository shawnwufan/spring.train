package com.shawn.spring.train;

public class HelloProxy {
	private Hello hello;

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}
	
	public void sayHello(){
		hello.sayHello();
	}
}
