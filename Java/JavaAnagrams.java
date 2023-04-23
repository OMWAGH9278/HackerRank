
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA ANAGRAMS
*/ 

import java.util.Scanner;

public class JavaAnagrams 
{
    static boolean isAnagram(String a, String b)
    {
        if(a.length() != b.length())
            return (false);
        String alower = a.toLowerCase();
        String blower = b.toLowerCase();
        char str1[] = alower.toCharArray();
        char str2[] = blower.toCharArray();
        int i = 0; 
        int j = 0;
        
        for(i = 0; i < str1.length; i++)
        {
            for(j = 0; j < str1.length; j++)
            {
                if(str1[i] == str2[j])
                {
                    str2[j] = '\0';
                    break;
                }
            }
        }
        
        if((i == str1.length) && (j != str1.length))
            return (true);
        else
            return (false);
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}