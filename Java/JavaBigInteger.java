
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA BIGINTEGER
*/ 

import java.io.*;
import java.math.*;

public class JavaBigInteger 
{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = in.readLine();
        String str2 = in.readLine();
        
        BigInteger num1 = new BigInteger(str1);
        BigInteger num2 = new BigInteger(str2);
        
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}

