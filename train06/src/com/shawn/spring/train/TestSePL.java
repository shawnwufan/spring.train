package com.shawn.spring.train;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class TestSePL {

	@Test
	public void test01() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello world'");
		System.out.println(exp.getValue().toString());
		System.out.println("------------------------------------");
	}

	@Test
	public void test02() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("1 + 2");
		System.out.println(exp.getValue().toString());
		System.out.println("------------------------------------");
	}

	@Test
	// 调用方法
	public void test03() {
		User user = new User();
		EvaluationContext context = new StandardEvaluationContext(user); // 设定上下文
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("name"); // == user.getName()
		System.out.println(exp.getValue(context));
		// 这种写法也可以：System.out.println(exp.getValue(user));
		System.out.println("------------------------------------");
	}

	@Test
	// 给属性赋值
	public void test04() {
		User user = new User();
		EvaluationContext context = new StandardEvaluationContext(user); // 设定上下文
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("name"); // == user.getName()
		exp.setValue(context, "吴帆");
		System.out.println(exp.getValue(context));
		System.out.println("------------------------------------");
	}

	@Test
	// 条件判断
	public void test05() {
		User user = new User();
		EvaluationContext context = new StandardEvaluationContext(user); // 设定上下文
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("name"); // == user.getName()
		exp.setValue(context, "shawn");
		exp = parser.parseExpression("name == 'shawn'");
		boolean result = exp.getValue(context, Boolean.class);
		System.out.println(result);
		System.out.println("------------------------------------");
	}

	@Test
	public void test06() {
		ExpressionParser parser = new SpelExpressionParser();
		List<Integer> result1 = parser.parseExpression("{1,2,3}").getValue(List.class);

		for (Integer i : result1) {
			System.out.println(i);
		}
	}

	@Test
	public void test07() {
		ExpressionParser parser = new SpelExpressionParser();
		// 定义一维数组未初始化
		int[] result1 = parser.parseExpression("new int[]{}").getValue(int[].class);
		// 声明二维数组并初始化
		int[] result2 = parser.parseExpression("new int[2]{1,2}").getValue(int[].class);
		Assert.assertEquals(result1.length, 0);
		Assert.assertEquals(result2.length, 2);
	}

	@Test
	public void test08() {
		ExpressionParser parser = new SpelExpressionParser();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		EvaluationContext context3 = new StandardEvaluationContext();
		context3.setVariable("map", map);
		int result3 = parser.parseExpression("#map['a'] = 2").getValue(context3, int.class);
		Assert.assertEquals(2, result3);
	}
}
