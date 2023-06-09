
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA SORT
*/ 

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

class Student
{
    
    private int id;
    private String fname;
    private double cgpa;
    
    public Student(int id, String fname, double cgpa) 
    {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() 
    {
        return id;
    }
    public String getFname() 
    {
        return fname;
    }
    public double getCgpa() 
    {
        return cgpa;
    }
}

class StudentSort implements Comparator<Student>
{
    double diff = 0;

    public int compare(Student s1, Student s2) 
    {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > diff) 
        {
            if(s1.getCgpa() < s2.getCgpa())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        } 
        else if (s1.getFname().equals(s2.getFname()) != true) 
        {
            return s1.getFname().compareTo(s2.getFname());
        } 
        else 
        {
            return s1.getId() - s2.getId();
        }
    }
}

class JavaSort
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int testCases = Integer.parseInt(sobj.nextLine());
        int cases = testCases;
        
        List<Student> studentList = new ArrayList<Student>();
        
        while(testCases > 0)
        {
            int id = sobj.nextInt();
            String fname = sobj.next();
            double cgpa = sobj.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }
        
        Collections.sort(studentList, new StudentSort());
      
          for(int iCnt = 0; iCnt < cases; iCnt++)
        {
            System.out.println(studentList.get(iCnt).getFname());
        }

        sobj.close();
    }
}
