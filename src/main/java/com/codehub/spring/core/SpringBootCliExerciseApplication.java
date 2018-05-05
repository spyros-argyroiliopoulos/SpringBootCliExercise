package com.codehub.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codehub.spring.core.service.LineService;
import com.codehub.spring.core.service.TriangleService;

@SpringBootApplication
public class SpringBootCliExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCliExerciseApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringBootCliExerciseApplication.class, args);
		TriangleService triangleService = (TriangleService) ctx.getBean("triangleServiceImpl");
		System.out.println(triangleService.findLargerArea());

		LineService lineService = (LineService) ctx.getBean("lineServiceImpl");
		System.out.println(lineService.findShortestLine());
	}
}
