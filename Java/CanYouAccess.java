import java.io.*;
import java.util.*;

public class CanYouAccess {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();

        CanYouAccess.Inner.Private pobj = new CanYouAccess().new Inner().new Private(i);
        pobj.powerof2();

        System.out.println("An instance of class: Solution.Inner.Private has been created");
    }

    class Inner {
        class Private {
            public int i;

            Private(int num) {
                i = num;
            }

            public void powerof2() {
                int temp = i;
                while (i != 1) {
                    if (i % 2 != 0)
                        break;
                    i = i / 2;
                }
                System.out.println((i == 1) ? temp + " is power of 2" : temp + " is not a power of 2");
            }
        }
    }
}