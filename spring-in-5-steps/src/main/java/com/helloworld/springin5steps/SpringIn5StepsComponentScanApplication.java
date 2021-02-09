package com.helloworld.springin5steps;

import com.helloworld.componentscan.ComponentDAO;
import com.helloworld.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.awt.*;

@Configuration
@ComponentScan("com.helloworld.componentscan")

public class SpringIn5StepsComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);

	}

}
