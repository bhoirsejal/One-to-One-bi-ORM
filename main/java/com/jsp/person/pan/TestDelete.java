package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Pan pan = entityManager.find(Pan.class, 8);
		Person person = entityManager.find(Person.class, 8);
		pan.setPerson(person);

		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(pan);
		entityTransaction.commit();

	}
}
