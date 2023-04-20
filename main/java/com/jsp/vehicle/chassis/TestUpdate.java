package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Chassis chassis = entityManager.find(Chassis.class, 2);
		Vehicle vehicle = entityManager.find(Vehicle.class, 1);

		chassis.setChassis_number("sb263876");
		vehicle.setName("xyz");
		vehicle.setBrand("asd");
		vehicle.setColor("white");

		entityTransaction.begin();
		entityManager.merge(vehicle);
		entityManager.merge(chassis);
		entityTransaction.commit();
	}

}
