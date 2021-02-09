package com.helloworld.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}
}
