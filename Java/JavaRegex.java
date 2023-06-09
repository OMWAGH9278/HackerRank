
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA REGEX
*/ 

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex
{
    public String pattern;
    MyRegex()
    {
        pattern = "(\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5]).(\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5]).(\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5]).(\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5])";
    }
}