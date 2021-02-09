package com.in28minutes.database.databasedemo.jpa;

import com.in28minutes.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

// Repository,  to manage entiry
// Transaction , ideally implemented around busisness services

@Repository
@Transactional
public class PersonJpaRepository {
	// connect to database, alike jdbc template in sping jdbc
	// EntityManager is interface to PersistenceContext, all operations performing in a specific session are all going thru/ stored inside EntityManager
	@PersistenceContext
	EntityManager entityManager;


	public Person findById (int id ) {
				return entityManager.find(Person.class, id); // jpa
	}
	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public void deleteById(int id) {
		Person person= findById(id);
		entityManager.remove(person);
	}

	public List<Person> findAll() {
		// JPQL vs sql, named query
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_person", Person.class);
		return namedQuery.getResultList();
	}
}
