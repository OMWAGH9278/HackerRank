
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA EXCEPTION HANDLING - II
*/

import java.util.Scanner;

class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException(String message) {
        super(message);
    }
}

class ZeroNumberException extends Exception {
    public ZeroNumberException(String message) {
        super(message);
    }
}

class MyCalculator {
    public long power(int a, int b) throws Exception {
        if ((a < 0) || (b < 0)) {
            throw new Exception("n or p should not be negative.");

        }
        if ((a == 0) && (b == 0)) {
            throw new Exception("n and p should not be zero.");
        }
        long ans = Math.round(Math.pow(a, b));
        return (ans);

    }
}

public class JavaExceptionHandlingII {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}