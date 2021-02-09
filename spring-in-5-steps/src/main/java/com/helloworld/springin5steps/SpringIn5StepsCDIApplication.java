package com.helloworld.springin5steps;

import com.helloworld.springin5steps.cdi.SomeCDIBusiness;
import com.helloworld.springin5steps.cdi.SomeCDIDAO;
import com.helloworld.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCDIApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCDIApplication.class);
		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());
	}
}
