
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA STRINGS INTRODUCTION
*/ 

import java.util.*;

public class JavaStringsIntroduction
{
    public static void main(String ar[]) 
    {
        
        Scanner sobj = new Scanner(System.in);
        String str1 = sobj.next();
        String str2 = sobj.next();
        
        int str_length = str1.length() + str2.length();
        System.out.println(str_length);

        char crr1[] = str1.toCharArray();
        char crr2[] = str2.toCharArray();

        if(crr1[0] > crr2[0])
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        crr1[0] = Character.toUpperCase(crr1[0]);    
        crr2[0] = Character.toUpperCase(crr2[0]);    

        str1 = String.valueOf(crr1);
        str2 = String.valueOf(crr2);

        System.out.println(str1+" "+str2);
        sobj.close();
    }
}
