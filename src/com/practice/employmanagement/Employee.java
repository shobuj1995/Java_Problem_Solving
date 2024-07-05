package com.practice.employmanagement;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.Date;

public class Employee {
    public String empName;
    public double empSalary;
    public LocalDate hireDate;

    public Employee(String empName, double empSalary, LocalDate hireDate) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.hireDate = hireDate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public void calculateExperience(){
        LocalDate localDate=LocalDate.now();
        Period duration= Period.between(hireDate,localDate);
        System.out.println(duration.getYears());
    }

    public static void main(String[] args) {
        LocalDate empJoinDate=LocalDate.parse("2021-04-01");
        Employee employee1=new Employee("Rohit",20000,empJoinDate);
        employee1.calculateExperience();
    }
}
