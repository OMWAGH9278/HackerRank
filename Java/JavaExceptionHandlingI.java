
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA EXCEPTION HANDLING - I
*/

import java.util.*;

public class JavaExceptionHandlingI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int x = in.nextInt();
            int y = in.nextInt();
            int ans = x / y;
            System.out.println(ans);
        } catch (InputMismatchException obj) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException obj) {
            System.out.println(obj);
        } catch (Exception obj) {
            System.out.println(obj);
        }
    }
}
