
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA DEQUEUE
*/

import java.util.*;

public class JavaDequeue {

    public static int maxUniqueElementFromSubstring(int arr[], int m) {
        int maxUnique = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < ((arr.length - m) + 1); ++i) {
            for (int j = i; j < (i + m); ++j) {
                int num = arr[j];
                if (dq.contains(num)) {
                    dq.pollFirst();
                }
                dq.offerLast(num);
                maxUnique = Math.max(maxUnique, dq.size());
            }
            dq.clear();
        }
        return (maxUnique);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }

        int max = maxUniqueElementFromSubstring(arr, m);
        System.out.println(max);
    }
}
