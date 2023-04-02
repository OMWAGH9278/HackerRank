
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA IF-ELSE
*/ 

import java.util.*;

public class JavaIfElse 
{
    private static final Scanner sobj = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int N = sobj.nextInt();
        
        if((N % 2) != 0)
        {
            System.out.println("Weird");
        }
        else if(((N % 2) == 0) && (N >= 2) && (N <= 5))
        {
            System.out.println("Not Weird");
        }
        else if(((N % 2) == 0) && (N >= 6) && (N <= 20))
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }

        sobj.close();
    }
}

