package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Chassis chassis = entityManager.find(Chassis.class, 1);
		Vehicle vehicle = entityManager.find(Vehicle.class, 1);
		System.out.println("Chassis ID     : " + chassis.getId());
		System.out.println("Chassis Number   : " + chassis.getChassis_number());

		System.out.println("=================Vehicle Detail==================");

		System.out.println("Vehicle ID : " + vehicle.getId());
		System.out.println("Vehicle ID : " + vehicle.getName());
		System.out.println("Vehicle ID : " + vehicle.getColor());
		System.out.println("Vehicle ID : " + vehicle.getBrand());

	}

}
