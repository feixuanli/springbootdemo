package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJDBCDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	//CommandLineRunner interface methods defined within will be run when spring application lauched

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJDBCDAO personJDBCDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", personJDBCDAO.findAll());

		logger.info("User id 10001-> {}", personJDBCDAO.findById(10001));

		logger.info("Deleting id 10002-> {}", personJDBCDAO.deleteById(10002));

//		logger.info("inserting id 10004-> {}", personJDBCDAO.insert(new Person(10004, "tara", "berlin", new Date())));

//		logger.info("updating id 10004-> {}", personJDBCDAO.update(new Person(10003, "tom3", "beijing", new Date())));
	}
}
