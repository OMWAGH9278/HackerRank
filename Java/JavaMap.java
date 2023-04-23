
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA MAP
*/ 

import java.util.*;

class JavaMap 
{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String,Integer> phoneBook = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			phoneBook.put(in.nextLine(),in.nextInt());
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(phoneBook.containsKey(s))
                System.out.println(s+"="+phoneBook.get(s));
            else
                System.out.println("Not found");
		}
        in.close();
	}
}




