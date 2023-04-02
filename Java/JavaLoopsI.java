
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA LOOPS I
*/  

import java.io.*;

class Arithmetic
{
    public void table(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
            System.out.println(iNo+" x "+iCnt+" = "+iCnt*iNo);
    }
}

class JavaLoopsI
{
    public static void main(String arg[]) throws IOException 
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        int iValue = Integer.parseInt(bobj.readLine().trim());
        Arithmetic aobj = new Arithmetic();
        aobj.table(iValue);
        bobj.close();
    }
}

