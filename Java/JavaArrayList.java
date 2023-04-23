
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA ARRAYLIST
*/ 

import java.util.*;

public class JavaArrayList 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            ArrayList<Integer> row = new ArrayList<>();
            String s[] = in.nextLine().split(" ");
            try
            {
                for(int j = 0; j < s.length; j++)
                    row.add(Integer.parseInt(s[j]));
            }
            catch(NumberFormatException obj)
            {
                row.add(0);
            }
            arr.add(row);
        }
        int q = in.nextInt();
        for(int i = 0; i < q; i++)
        {
            try
            {    
                int x = in.nextInt();
                int y = in.nextInt();
                System.out.println(arr.get(x-1).get(y));
            }
            catch(IndexOutOfBoundsException obj)
            {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}
