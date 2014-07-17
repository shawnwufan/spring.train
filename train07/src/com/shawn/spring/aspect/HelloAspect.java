package com.shawn.spring.aspect;

public class HelloAspect {
	// 前置通知
	public void beforeAdvice() {
		System.out.println("开始执行前置处理");
	}

	// 前置通知
	public void beforeAdviceByParam(String msg) {
		System.out.println("开始执行前置处理，参数为： " + msg);
	}

	// 后置最终通知
	public void afterAdvice() {
		System.out.println("开始执行带参数的后置处理");
	}

	// 后置最终通知（带参数）
	public void afterAdviceByParam(String msg) {
		System.out.println("开始执行带参数的后置处理，参数为： " + msg);
	}

	// 后置返回通知
	public void afterReturningAdvice(Object retVal) {
		int result = retVal.toString().length();
		System.out.println("返回结果的内容长度: " + result);
	}
}
