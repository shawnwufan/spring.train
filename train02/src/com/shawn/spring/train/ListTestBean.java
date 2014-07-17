package com.shawn.spring.train;

import java.util.List;

public class ListTestBean {
	private List<String> values;

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public void getList(){
		for(String str : values){
			System.out.println(str);
		}
	}
}
