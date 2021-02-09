package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// 1, spring context
// 2, auto configuration
// 3, component scan
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		// .run returns a spring context

		for( String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println("name");

			System.out.println(name);
		}
	}

}
