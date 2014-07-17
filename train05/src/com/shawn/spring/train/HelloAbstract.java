package com.shawn.spring.train;

public abstract class HelloAbstract implements HelloRandom{
	private Random random;

	public void setRandom(Random random) {
		this.random = random;
	}

	public Random getRandom() {
		return this.random;
	}

	public abstract Random createRandom();
}
