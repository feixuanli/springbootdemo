package com.in28minutes.database.databasedemo.springdata;

import com.in28minutes.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface PersonSpringDataRepository extends JpaRepository<Person,Integer> {
	//pre-defined repositories,
	// methods such as findall insert update delete are pre defined inside JpaRepository
}
