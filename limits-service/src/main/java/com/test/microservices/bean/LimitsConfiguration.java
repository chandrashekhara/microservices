package com.test.microservices.bean;

public class LimitsConfiguration {

	private int min;
	private int max;
	
	public LimitsConfiguration() {
		super();
	}

	public LimitsConfiguration(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public LimitsConfiguration setMin(int min) {
		this.min = min;
		return this;
	}

	public int getMax() {
		return max;
	}

	public LimitsConfiguration setMax(int max) {
		this.max = max;
		return this;
	}

}
