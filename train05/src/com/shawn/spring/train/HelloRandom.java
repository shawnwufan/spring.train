package com.shawn.spring.train;

public interface HelloRandom {
	public Random getRandom();

	public abstract Random createRandom(); // 这个方法最为重要，是方法注入的关键
}
