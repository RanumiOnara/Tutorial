package com.mycompany.test2;
public class Student 
{
      //declare variables
    private int StudentID;
    private String StudentName,course;
    
    //setter method for Student ID
    public void setStudentID(int StudentID)
    {
        this.StudentID=StudentID;
    }
    //getter method for Student ID
    public int getStudentID()
    {
        return StudentID;
    }
    
     //setter method for StudentName
    public void setStudentName(String StudentName)
    {
        this.StudentName=StudentName;
    }
    //getter method for StudentName
    public String getStudentName()
    {
        return StudentName;
    }
    
     //setter method for course
    public void setCourse(String course)
    {
        this.course=course;
    }
    //getter method for course
    public String getCourse()
    {
        return course;
    }
    
    public void display()
    {
        String lecID = null;
        System.out.println("LecturerID: "+lecID);
        String lecName = null;
        System.out.println("Lecturer Name: "+lecName);
        String program = null;
        System.out.println("program: "+program);
        System.out.println("StudentID: "+StudentID);
        System.out.println("Student Name: "+StudentName);
        System.out.println("course: "+course);
  }
            
            

}
    

