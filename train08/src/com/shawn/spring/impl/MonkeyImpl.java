package com.shawn.spring.impl;

import com.shawn.spring.service.Monkey;

public class MonkeyImpl implements Monkey {

	@Override
	public void stealPeaches(String name) {
		System.out.println("�����ӡ�" + name + "����͵��...");
	}
}
