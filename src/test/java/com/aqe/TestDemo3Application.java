package com.aqe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemo3Application {

	public static void main(String[] args) {
		SpringApplication.from(Demo3Application::main).with(TestDemo3Application.class).run(args);
	}

}
