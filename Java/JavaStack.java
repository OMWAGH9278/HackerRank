
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA STACK
*/

import java.util.*;

class JavaStack
{	
    public static boolean isBalanced(String input)
    {
        
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if((c == '{') || (c == '[') || (c == '('))
            {
                s.push(c);
            }
            else if((c == '}') || (c == ']') || (c == ')'))
            {
                if(s.isEmpty())
                {
                    return (false);
                }
                else 
                {
                    char last = s.pop();
                    if((c == '}' && last != '{') || (c == ']' && last != '[') || (c == ')' && last != '('))
                    {
                        return (false);
                    }
                }
            }
        }
        return (s.isEmpty());
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) 
        {
			String input=sc.next();
            
            System.out.println(isBalanced(input));
		}
        sc.close();		
	}
}
