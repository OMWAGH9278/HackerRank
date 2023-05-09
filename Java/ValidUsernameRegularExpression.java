
/*
    AUTHOR : OM MANGESH WAGH
    TITLE :  VALID USERNAME REGULAR EXPRESSION
*/

import java.io.*;
import java.util.*;

public class ValidUsernameRegularExpression {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while (n-- != 0) {
            String str = in.nextLine();
            if ((str.matches("[a-zA-Z][a-zA-Z0-9_]+")) && (str.length() >= 8) && (str.length() <= 30))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}