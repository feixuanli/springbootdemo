package com.in28minutes.database.databasedemo.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * JPA: interface, complex database tables, relations , queries
 * Hibernate: implementation, comes to popular before JPA
 */

@Entity
//@Table(name"person")  not needed bc by default map to class name which is already the same
@NamedQuery(name="find_all_person", query="select p from Person p")
public class Person {

	@Id  // indicate primary key
	@GeneratedValue // let hibernate to populate id values
	private int id;

	//	@Column(name="name")
	private String name;
	private String location;
	private Date birthDate;

	//	no arg construcor reuqired by BeanPropertyRowMapper
	public Person() {
		// default Provided by java
	}

	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	public Person(String name, String location, Date birthDate) {
			super();
			this.name = name;
			this.location = location;
			this.birthDate = birthDate;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "\n Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", location='" + location + '\'' +
				", birthDate=" + birthDate +
				'}';
	}
}
