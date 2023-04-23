
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  PATTERN SYNTAX CHECKER
*/ 

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            try
            {
                Pattern pobj = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException obj)
            {
                System.out.println("Invalid");
            }
          	testCases--;
		}
        in.close();
	}
}



