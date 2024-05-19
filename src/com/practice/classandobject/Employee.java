package com.practice.classandobject;

public class Employee {
    private String employeeName,jobTitle;
    private Double salary;

    public Employee(String employeeName, String jobTitle, Double salary) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void raiseSalary(double percentage){
        salary= salary+salary*percentage/100;
    }

    public void printEmployeInfo(){
        System.out.println("EmployeeNmae:"+ this.employeeName+" JobTitle: "+ jobTitle+" Current Salary: "+ salary);
    }
    public static void main(String[] args) {
        Employee employee1=new Employee("Sagor","Developer",50000.0);
        Employee employee2=new Employee("Rohit","Networking",55000.0);
        Employee employee3=new Employee("Tauhid","Devops",60000.0);
        System.out.println("Sagor Current Salary info");
        employee1.printEmployeInfo();
        employee1.raiseSalary(8.0);
        System.out.println(" Sagor salary after raise 8%");
        employee1.printEmployeInfo();
    }


}
