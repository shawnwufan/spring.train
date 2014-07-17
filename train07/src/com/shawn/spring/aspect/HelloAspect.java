package com.shawn.spring.aspect;

public class HelloAspect {
	// ǰ��֪ͨ
	public void beforeAdvice() {
		System.out.println("��ʼִ��ǰ�ô���");
	}

	// ǰ��֪ͨ
	public void beforeAdviceByParam(String msg) {
		System.out.println("��ʼִ��ǰ�ô�������Ϊ�� " + msg);
	}

	// ��������֪ͨ
	public void afterAdvice() {
		System.out.println("��ʼִ�д������ĺ��ô���");
	}

	// ��������֪ͨ����������
	public void afterAdviceByParam(String msg) {
		System.out.println("��ʼִ�д������ĺ��ô�������Ϊ�� " + msg);
	}

	// ���÷���֪ͨ
	public void afterReturningAdvice(Object retVal) {
		int result = retVal.toString().length();
		System.out.println("���ؽ�������ݳ���: " + result);
	}
}
