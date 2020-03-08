package com.test.microservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class PropConfiguration {

	private int min;
	private int max;

	public int getMin() {
		return min;
	}

	public PropConfiguration setMin(int min) {
		this.min = min;
		return this;
	}

	public int getMax() {
		return max;
	}

	public PropConfiguration setMax(int max) {
		this.max = max;
		return this;
	}

}
