
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA PRIMALITY TEST
*/ 

import java.io.*;
import java.math.*;

public class JavaPrimalityTest 
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger obj = new BigInteger(n);
        if(obj.isProbablePrime(50))
            System.out.println("prime");
        else
            System.out.println("not prime");

        bufferedReader.close();
    }
}
