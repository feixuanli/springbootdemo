package com.helloworld.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	@Autowired
	JdbcConnection jdbcConnection;

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}
}
