package com.testdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({HomeTestDataSettings.class,MotorTestDataSettings.class})
public class PropertyTestDataDemo {

	public static void main(String[] args) {
		SpringApplication.run(PropertyTestDataDemo.class, args);
	}
}
