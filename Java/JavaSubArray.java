
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  JAVA SUBARRAY
*/ 

import java.util.*;

public class JavaSubArray 
{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        
        ArrayList<ArrayList<Integer>> subArray = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                ArrayList<Integer> subArr = new ArrayList<>();
                for(int k = i; k < j+1; k++)
                {
                    subArr.add(arr[k]); 
                }
                subArray.add(subArr);
            }
        }
        int sum = 0, negativeArrayCount = 0;
        for(int i = 0; i < subArray.size(); i++)
        {
            for(int j = 0; j < subArray.get(i).size(); j++)
                sum = sum + subArray.get(i).get(j); 
            
            if(sum < 0)
                negativeArrayCount++;
            
            sum = 0;
        }
        System.out.println(negativeArrayCount);
        
        in.close();           
    }
}
