package com.mycompany.part1;
public class item 
{
       //declare variables
    private int location;
    private String description;
    
    //constructor
    public item(int location,String description)
    {
        this.location=location;
        this.description=description;
  
    }
    //setter method for location
    public void setLocation(int location)
    {
        this.location=location;
    }
    //getter method for location
    public int getLocation()
    {
        return location;
    }
    //setter method for description
    public void setDescription(String d)
    {
        this.description=description;
    }
    //getter method for description
    public String getDescription()
    {
        return description;
    }
    public void displayA()
    {
        System.out.println("location is: "+location);
        System.out.println("description is: "+description);
    }
 
}
