package com.jsp.vehicle.chassis;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "select p from Chassis p";
		String sql1 = "select p from Vehicle p";
		Query query = entityManager.createQuery(sql);
		Query query2 = entityManager.createQuery(sql1);
		List<Chassis> chassis = query.getResultList();
		List<Vehicle> vehicles = query.getResultList();
		for (Chassis chassis2 : chassis) {
			System.out.println(chassis2.getId());
			System.out.println(chassis2.getChassis_number());
			System.out.println("===================");
		}
		System.out.println("==================Vehicle Detials========================");
		for (Vehicle vehicle : vehicles) {
			System.out.println("=============================================");
			System.out.println(vehicle.getId());
			System.out.println(vehicle.getName());
			System.out.println(vehicle.getBrand());
			System.out.println(vehicle.getColor());

		}

	}

}
