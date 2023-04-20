package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = entityManager.find(Person.class, 7);
		person.setName("xyz");
		person.setEmail("xyz@gmail.com");
		person.setGender("Male");

		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();

	}

}
