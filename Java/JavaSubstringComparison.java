
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA SUBSTRING COMPARISON
*/ 

public class JavaSubstringComparison 
{
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        
        char str[] = s.toCharArray();
        char ch[] = new char[k];
        
        for(int i = 0; i < (str.length - (k-1)); i++)
        {
            for(int j = i; j < (k + i); ++j)
            {
                ch[j-i] = str[j];   
            }
            String str2 = new String(ch);
            if((str2.compareTo(smallest)) < 0)
            {
                smallest = str2;
            } 
            if((str2.compareTo(largest)) > 0)
            {
                largest = str2;
            }
        }
        
        return smallest + "\n" + largest;
    }
}
