package com.jsp.person.pan;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "select p from Person p";
		Query query = entityManager.createQuery(sql);
		List<Person> persons = query.getResultList();
		for (Person person : persons) {
			System.out.println("================================================");
			System.out.println("Person ID     : " + person.getId());
			System.out.println("Person Name   : " + person.getName());
			System.out.println("Person Email  : " + person.getEmail());
			System.out.println("Person Gender : " + person.getGender());
		}

	}

}
