package com.in28minutes.spring.aop.springaop.business;

import com.in28minutes.spring.aop.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
	@Autowired
	private Dao1 dao1;

	public String calculateSomthing() {
		// Business Logic
		return dao1.retrieveSomething();
	}
}
