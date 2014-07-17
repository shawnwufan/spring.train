package com.shawn.spring.train;

import java.util.Map;

public class MapTestBean {
	private Map<String, String> values;

	public Map<String, String> getValues() {
		return values;
	}

	public void setValues(Map<String, String> values) {
		this.values = values;
	}

	public void getMap() {
		for (String str : values.keySet()) {
			System.out.println("key is " + str + " value is " + values.get(str));
		}
	}
}
