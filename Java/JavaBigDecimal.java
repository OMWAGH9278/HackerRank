
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA BIGDECIMAL
*/

import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        String k[] = new String[200];
        for (int i = 0; i < n; i++) {
            k[i] = s[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BigDecimal a = new BigDecimal(s[i]);
                BigDecimal b = new BigDecimal(s[j]);
                if (a.max(b) != a) {
                    String swap = s[i];
                    s[i] = s[j];
                    s[j] = swap;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                BigDecimal a = new BigDecimal(s[i]);
                BigDecimal b = new BigDecimal(k[j]);
                if (a.equals(b)) {
                    s[i] = k[j];
                    for (int c = j + 1; c < n; c++) {
                        BigDecimal d = new BigDecimal(k[c]);
                        if (b.equals(d)) {
                            k[j] = k[c];
                        }
                    }
                    j = n;
                }
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}