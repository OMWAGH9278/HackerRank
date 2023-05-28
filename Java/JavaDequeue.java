
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA DEQUEUE
*/

import java.util.*;
import java.lang.Math;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Deque<Integer> dq = new LinkedList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (i >= m) {
                int first = dq.removeFirst();
                hm.put(first, hm.get(first) - 1);
                if (hm.get(first) == 0)
                    hm.remove(first);
            }
            dq.addLast(num);
            hm.put(num, hm.get(num) == null ? 1 : hm.get(num) + 1);
            max = Math.max(max, hm.size());
            if (max == m)
                break;
        }
        System.out.println(max);
    }
}
