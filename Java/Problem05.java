
// Java Output Formatting

import java.util.Scanner;

public class Problem05 
{
    public static void main(String[] args) 
    {
            Scanner sobj = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1 = sobj.next();
                int x = sobj.nextInt();
                System.out.printf("%-15s%03d\n",s1,x);
            }
            System.out.println("================================");

            sobj.close();
    }
}

