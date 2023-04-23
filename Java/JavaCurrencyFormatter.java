
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA CURRENCY FORMATTER
*/ 

import java.text.*;
import java.util.*;

public class JavaCurrencyFormatter
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        double payment = sobj.nextDouble();
        sobj.close();

        NumberFormat nobj = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nobj.format(payment);
        
        nobj = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-IN"));
        String india = nobj.format(payment);

        nobj = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nobj.format(payment);

        nobj = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nobj.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
