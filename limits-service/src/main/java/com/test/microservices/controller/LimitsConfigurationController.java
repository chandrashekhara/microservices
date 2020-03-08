package com.test.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.microservices.PropConfiguration;
import com.test.microservices.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private PropConfiguration propConfiguration;

	@GetMapping("/limits")
	public LimitsConfiguration getLimitsConfiguration() {
		return new LimitsConfiguration(propConfiguration.getMin(), propConfiguration.getMax());
	}

}
