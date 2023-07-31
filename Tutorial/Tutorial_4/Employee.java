package com.mycompany.test;
public class Employee
{
        //declare variables
    private int empID;
    private String empName,empDestination;
    
    //setter method for employeeID
    public void setEmpID(int empID)
    {
        this.empID=empID;
    }
   //getter method for employeeID
    public int getEmpID()
    {
        return empID;
    }
    
    //setter method for employe Name
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
   //getter method for employee Name
    public String getEmpName()
    {
        return empName;
    }
    
    //setter method for employee Destination
    public void setEmpDestination(String empDestination)
    {
        this.empDestination=empDestination;
    }
   //getter method for employee Destination
    public String getEmpDestination()
    {
        return empDestination;
    }
}

