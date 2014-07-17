package com.shawn.spring.train;

import java.util.List;
import java.util.Map;

public class ComplexBean {
	private Map<String, List<String>> complex;

	public Map<String, List<String>> getComplex() {
		return complex;
	}

	public void setComplex(Map<String, List<String>> complex) {
		this.complex = complex;
	}

	public void getInfo() {
		for (String k : complex.keySet()) {
			for (String v : complex.get(k)) {
				System.out.println("key is " + k + " value is " + v);
			}
		}
	}
}
