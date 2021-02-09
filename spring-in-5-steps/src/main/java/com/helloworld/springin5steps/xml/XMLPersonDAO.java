package com.helloworld.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class XMLPersonDAO {
	XMLJdbcConnection xmlJdbcConnection;

	public void setXMLJdbcConnection(XMLJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}

	public XMLJdbcConnection getXMLJdbcConnection() {
		return xmlJdbcConnection;
	}
}
