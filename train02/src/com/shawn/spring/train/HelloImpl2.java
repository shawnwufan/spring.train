package com.shawn.spring.train;

public class HelloImpl2 implements Hello {
	private String message;
	private int index;

	// setter·½·¨
	public void setMessage(String message) {
		this.message = message;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(index + ":" + message);
	}

}
