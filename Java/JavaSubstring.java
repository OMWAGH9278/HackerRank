
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA SUBSTRING
*/ 

import java.util.*;

public class JavaSubstring 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String str = S.substring(start,end);
        System.out.println(str);
        in.close();
    }
}
