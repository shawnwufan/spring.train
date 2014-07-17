package com.shawn.spring.train;

import org.springframework.beans.factory.annotation.Value;

public class User2 {
	@Value("#{'Hello'}")
	private String name;
	private Integer age = 100;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
