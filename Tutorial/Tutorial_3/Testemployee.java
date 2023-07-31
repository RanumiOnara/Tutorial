package com.mycompany.testemployee;
public class Testemployee {

    public static void main(String[] args) 
    {
       Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(50000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}

       
    

