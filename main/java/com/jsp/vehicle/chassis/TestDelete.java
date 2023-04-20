package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Chassis chassis = entityManager.find(Chassis.class, 1);
		Vehicle vehicle = entityManager.find(Vehicle.class, 1);

		entityTransaction.begin();
		entityManager.remove(chassis);
		entityManager.remove(vehicle);
		entityTransaction.commit();
	}

}
