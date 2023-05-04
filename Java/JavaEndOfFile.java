
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA END-OF-FILE
*/ 

import java.util.Scanner;

public class JavaEndOfFile 
{
    public static void main(String arg[]) 
    {
       Scanner sobj = new Scanner(System.in);
       int iCnt = 1;
       while(sobj.hasNext())
       {
           String str = sobj.nextLine();
           System.out.println(iCnt+" "+str);
           iCnt++;
       } 
       sobj.close();
    }
}
