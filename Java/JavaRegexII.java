
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA REGEX II
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JavaRegexII 
{
    public static void main(String[] args) 
    {
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        System.out.println(regex);
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        System.out.println(regex);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        for(int i = 0; i < numSentences; i++) 
        {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            
            if(m.find())
                input = input.replaceAll("(?i)"+m.group(), m.group(1));
            
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
