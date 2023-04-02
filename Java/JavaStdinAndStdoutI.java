
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA STDIN AND STDOUT I
*/ 

import java.util.*;

public class JavaStdinAndStdoutI 
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        int c = sobj.nextInt();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sobj.close();
    }
}
