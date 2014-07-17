package com.shawn.spring.train;

public class HelloImpl implements Hello {
	private String message;
	private int index;

	// @java.beans.ConstructorProperties({"message", "index"})
	public HelloImpl(String message, int index) {
		this.message = message;
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(index + ":" + message);
	}

}
