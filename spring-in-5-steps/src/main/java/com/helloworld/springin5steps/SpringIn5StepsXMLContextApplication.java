package com.helloworld.springin5steps;

import com.helloworld.springin5steps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringIn5StepsXMLContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);



			LOGGER.info("Beans loaded  -> {}", (Object)applicationContext.getBeanDefinitionNames());
			LOGGER.info("{} {}", xmlPersonDAO,  xmlPersonDAO.getXMLJdbcConnection());

		}
	}

}
