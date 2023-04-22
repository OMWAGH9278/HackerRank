
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA STDIN AND STDOUT II
*/ 

import java.util.Scanner;

public class JavaStdinAndStdoutII 
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int i = sobj.nextInt();
        double d = sobj.nextDouble();
        sobj.nextLine();
        String s = sobj.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        sobj.close();
    }
}
