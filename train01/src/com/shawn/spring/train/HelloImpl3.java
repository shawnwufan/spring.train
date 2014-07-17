package com.shawn.spring.train;

public class HelloImpl3 {

	public static Hello newInstance(String str){
		return new HelloImpl2(str);
	}
}
