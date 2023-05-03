
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA LIST
*/ 

import java.util.*;

class JavaList 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
            arr.add(in.nextInt());
        int q = in.nextInt();
        in.nextLine();
        for(int i = 0; i < q; i++)
        {
            String str = in.nextLine();
            int element = 0, index = 0;
            if(str.equals("Insert"))
            {
                try
                {   
                    String s[] = in.nextLine().split(" ");
                    index = Integer.parseInt(s[0]);
                    element = Integer.parseInt(s[1]);
                }
                catch(NumberFormatException obj)
                {
                    index = 0;
                }
                arr.add(index, element);
            }
                
            if(str.equals("Delete"))
            {
                try
                {   
                    String s = in.nextLine();
                    index = Integer.parseInt(s);
                }
                catch(NumberFormatException obj)
                {
                    index = 0;
                }
                arr.remove(index);
            }       
        }
        for(int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i)+" ");
        in.close();
    }
}
