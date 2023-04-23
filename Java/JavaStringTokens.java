
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA STRING TOKENS
*/ 

import java.util.*;

public class JavaStringTokens 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        String str[] = s.split("[^a-zA-Z]+");
        
        if(s.length() == 0)
            System.out.println("0");
        else
            System.out.println(str.length);
            
        for(int i = 0; i < str.length; i++)
            System.out.println(str[i]);
        
        scan.close();
    }
}

