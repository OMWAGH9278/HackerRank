
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA BITSET
*/ 

import java.util.*;

public class JavaBitSet 
{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[] = in.nextLine().split(" ");
        BitSet b1 = new BitSet(Integer.parseInt(str[0]));
        BitSet b2 = new BitSet(Integer.parseInt(str[0]));
        for(int i = 0; i < Integer.parseInt(str[1]); i++)
        {
            String s[] = in.nextLine().split(" ");
            if(s[0].equals("AND"))
            {
                if(Integer.parseInt(s[1]) == 1)
                {
                    if(Integer.parseInt(s[2]) == 1)
                        b1.and(b1);
                    else
                        b1.and(b2);
                }
                else
                {
                    if(Integer.parseInt(s[2]) == 1)
                        b2.and(b1);
                    else
                        b2.and(b2);
                }
            }
            if(s[0].equals("OR"))
            {
                if(Integer.parseInt(s[1]) == 1)
                {
                    if(Integer.parseInt(s[2]) == 1)
                        b1.or(b1);
                    else
                        b1.or(b2);
                }
                else
                {
                    if(Integer.parseInt(s[2]) == 1)
                        b2.or(b1);
                    else
                        b2.or(b2);
                }
            }
            if(s[0].equals("XOR"))
            {
                if(Integer.parseInt(s[1]) == 1)
                {
                    if(Integer.parseInt(s[2]) == 1)
                        b1.xor(b1);
                    else
                        b1.xor(b2);
                }
                else
                {
                    if(Integer.parseInt(s[2]) == 1)
                        b2.xor(b1);
                    else
                        b2.xor(b2);
                }
            }
            if(s[0].equals("FLIP"))
            {
                if(Integer.parseInt(s[1]) == 1)
                    b1.flip(Integer.parseInt(s[2]));
                else
                    b2.flip(Integer.parseInt(s[2]));
            }
            if(s[0].equals("SET"))
            {
                if(Integer.parseInt(s[1]) == 1)
                    b1.set(Integer.parseInt(s[2]));
                else
                    b2.set(Integer.parseInt(s[2]));
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
            in.close();
        }
    }
}
