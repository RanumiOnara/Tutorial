package com.mycompany.test;
public class Test {

    public static void main(String[] args) 
    {
                //for Bogdan
        Employee Bogdan =new Employee();
        Bogdan.setEmpID(1234);
        Bogdan.setEmpName("Mr.Bogdan");
        Bogdan.setEmpDestination("Software Engineer");
       
        System.out.println("Bogdan's ID: "+Bogdan.getEmpID());
        System.out.println("Bogdan's Name: "+Bogdan.getEmpName());
        System.out.println("Bogdan's Destination: "+Bogdan.getEmpDestination());
        System.out.println("\n");
        //for Bird
        Employee Bird =new Employee();
        Bird.setEmpID(5678);
        Bird.setEmpName("Mr.Bird");
        Bird.setEmpDestination("Network Engineer");
       
        System.out.println("Bird's ID: "+Bird.getEmpID());
        System.out.println("Bird's Name: "+Bird.getEmpName());
        System.out.println("Bird's Destination: "+Bird.getEmpDestination());
        
        
    }
}
        
    
