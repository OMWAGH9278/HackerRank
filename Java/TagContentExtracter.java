
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : TAG CONTENT EXTRACTER
*/

import java.util.*;
import java.util.regex.*;

public class TagContentExtracter
{
    
	public static void main(String[] args)
    {	
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-- > 0)
        {
			String line = in.nextLine();
			
          	String regex = "<(.+)>([^<]+)</\\1>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);
            boolean flag = false;
            while(m.find())
            {
                System.out.println(m.group(2));
                flag = true;
            }
            if(!flag)
                System.out.println("None");			
		}
        in.close();
	}
}
