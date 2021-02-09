package com.helloworld.componentscan;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
// ??? how proxy works in application.context ???
public class ComponentJdbcConnection {
	public ComponentJdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
