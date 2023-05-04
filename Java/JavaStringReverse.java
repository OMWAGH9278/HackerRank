
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA STRING REVERSE
*/ 

import java.util.*;

public class JavaStringReverse 
{
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        char ch[] = A.toCharArray();
        int start = 0;
        int end  = A.length()-1;
        
        while(start < end)
        {
            if(ch[start] == ch[end])
            {}
            else
                break;
            
            start++;
            end--;
        }        
        
        if(start >= end)
            System.out.println("Yes");
        else 
            System.out.println("No");
        sc.close();
    }
}



