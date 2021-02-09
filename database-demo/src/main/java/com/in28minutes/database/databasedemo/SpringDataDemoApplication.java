package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
	//CommandLineRunner interface methods defined within will be run when spring application lauched

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 10001-> {}", repository.findById(10001));
		logger.info("inserting id 10004-> {}", repository.save(new Person("tara", "berlin", new Date())));
		logger.info("updating id 10003-> {}", repository.save(new Person(10003, "tom3", "beijing", new Date())));
		repository.deleteById(10002);

		logger.info("All users -> {}", repository.findAll());

	}
}
