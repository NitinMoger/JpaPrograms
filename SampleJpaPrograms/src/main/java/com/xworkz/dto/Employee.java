package com.xworkz.dto;


import javax.persistence.*;

@Entity
@Table(name = "employeedetails")
public class Employee {


    public Employee(){

    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double getEmployeeExperience() {
        return employeeExperience;
    }

    public void setEmployeeExperience(double employeeExperience) {
        this.employeeExperience = employeeExperience;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private  String employeeName;
    private  String employeeRole;
    private int employeeSalary;
    private double employeeExperience;

}
