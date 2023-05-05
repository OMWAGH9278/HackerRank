
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA 1D ARRAY II
*/

import java.util.*;

public class Java1DArrayII {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        boolean used[] = new boolean[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        used[0] = true;
        while (s.size() != 0) {
            int i = s.pop();
            if ((i + 1 >= n) || (i + leap >= n))
                return true;

            if ((i + 1 < n) && (game[i + 1] == 0) && (used[i + 1] == false)) {
                s.push(i + 1);
                used[i + 1] = true;
            }
            if ((i + leap < n) && (game[i + leap] == 0) && (used[i + leap] == false)) {
                s.push(i + leap);
                used[i + leap] = true;
            }
            if ((i - 1 >= 0) && (game[i - 1] == 0) && (used[i - 1] == false)) {
                s.push(i - 1);
                used[i - 1] = true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}