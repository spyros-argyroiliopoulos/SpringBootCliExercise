package com.codehub.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codehub.spring.core.controller.ShapeController;

@SpringBootApplication
public class SpringBootCliExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCliExerciseApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringBootCliExerciseApplication.class, args);
		ShapeController controller = (ShapeController) ctx.getBean("shapeController");
		System.out.println(controller.getArea());
		System.out.println(controller.getLength());
	}
}
