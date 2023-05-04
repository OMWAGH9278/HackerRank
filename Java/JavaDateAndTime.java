
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA DATE AND TIME
*/ 

import java.io.*;
import java.util.*;

class Result 
{

    public static String findDay(int month, int day, int year) 
    {
        Calendar cobj = Calendar.getInstance();

        cobj.set(year, month, day);

        int dayInInt = 0;
        dayInInt = cobj.get(Calendar.DAY_OF_WEEK);

        String str = Integer.toString(dayInInt);

        return str;
    }

}

public class JavaDateAndTime 
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
