package com.learn.fundamentalSpringJDBC;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SpringJpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public Persons findById(int id)
	{
		return entityManager.find(Persons.class, id);
	}
	
	public void  insert(Persons person) {
		 entityManager.persist(person);
	}
	
	public void add(Persons person) {
		entityManager.remove(person);
	}
	
	public void  update(Persons person) {
		 entityManager.merge(person);
	}
}
