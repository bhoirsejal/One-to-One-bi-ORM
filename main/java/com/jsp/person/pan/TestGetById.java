package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		System.out.println("Person ID     : " + person.getId());
		System.out.println("Person Name   : " + person.getName());
		System.out.println("Person Email  : " + person.getEmail());
		System.out.println("Person Gender : " + person.getGender());

	}

}
