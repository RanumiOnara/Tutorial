package com.mycompany.test2;
public class Lecture
{
        //declare variables
    protected int lecID;
    protected String lecName,program;
    
    //setter method for lecture ID
    public void setLecID(int lecID)
    {
        this.lecID=lecID;
    }
    //getter method for lecture ID
    public int getLecID()
    {
        return lecID;
    }
    
     //setter method for lectureName
    public void setLecName(String lecName)
    {
        this.lecName=lecName;
    }
    //getter method for lectureName
    public String getLecName()
    {
        return lecName;
    }
    
     //setter method for Progaram
    public void setProgram(String program)
    {
        this.program=program;
    }
    //getter method for Program
    public String getProgram()
    {
        return program;
    }
}

