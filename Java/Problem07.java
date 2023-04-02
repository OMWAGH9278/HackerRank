
// Java Loops II

import java.util.*;
import java.lang.Math;

class Solution
{
    public static void main(String arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        int t = sobj.nextInt();
        for(int i = 0; i < t; i++)
        {
            if((t >= 0) && (t <= 500))
            {
                int a = sobj.nextInt();
                int b = sobj.nextInt();
                int n = sobj.nextInt();
                iRet = a;
                for(int j = 0; j < n; j++)
                {
                    if((a >= 0) && (a <= 50) && (b >= 0) && (b <= 50) && (n >= 1) && (n <= 15))
                    {
                        iRet = iRet + (int)Math.pow(2,j) * b;
                        System.out.print(iRet+" ");
                    }
                    else
                    {
                        System.out.println("Invalid number of a, b or n");
                        break;
                    }
                }
                if(i < t-1)
                    System.out.println();
            }
            else
            {
                System.out.println("Invalid number of query");
                break;
            }
        }
        sobj.close();
    }
}

