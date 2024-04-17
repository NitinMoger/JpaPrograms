package com.xworkz.runner;

import com.xworkz.dao.EmployeeRepository;
import com.xworkz.dao.EmployeeRepositoryImpl;
import com.xworkz.dto.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeRunner{
    public static void main(String[] args) {

        Employee employee =new Employee();
        employee.setEmployeeName("Shambhu");
        employee.setEmployeeRole("Software Engineer");
        employee.setEmployeeSalary(20000);
        employee.setEmployeeExperience(1.5);

        EmployeeRepository empRepository=new EmployeeRepositoryImpl();
        empRepository.save(employee);



    }
}



