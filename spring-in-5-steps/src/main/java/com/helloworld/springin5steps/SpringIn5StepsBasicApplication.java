package com.helloworld.springin5steps;

import com.helloworld.springin5steps.basic.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {


	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
				BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

				System.out.println(binarySearch);
				System.out.println(binarySearch1);

				int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3 );
				System.out.println(result);
		}

//		applicationContext.close();
	}

}
