package com.xworkz.dao;

import com.xworkz.dto.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public void save(Employee employee) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction1 = entityManager.getTransaction();


        try {
            entityTransaction1.begin();
            entityManager.persist(employee);
            entityTransaction1.commit();
        } catch (Exception e) {
            System.out.println("Exception while inserting data....!!!!");
            entityTransaction1.rollback();
        } finally {
            entityManager.close();
            entityManagerFactory.close();    //closing the costly resources
        }
    }

}
