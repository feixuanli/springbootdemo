package com.webapp;

import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserValidationService {
	public boolean isUserValid(String user, String password) {
		if(user.equals("tom") && password.equals("dummy")) {
			return true;
		}
		return false;
	}
}
