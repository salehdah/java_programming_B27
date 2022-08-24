package practice;

import java.util.Scanner;

public class mothDays {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println(" please enter the month number");
        int a = number.nextInt();
        if (a == 1) {
            System.out.println(a + "\n31");
        }
        if (a == 2) {
            System.out.println(a + "\n28");
        }
        if (a == 3) {
            System.out.println(a + "\n31");
        }
        if (a == 4) {
            System.out.println(a + "\n30");
        }
        if (a == 5) {
            System.out.println(a + "\n31");
        }
        if (a == 6) {
            System.out.println(a + "\n30");
        }
        if (a == 7) {
            System.out.println(a + "\n31");
        }
        if (a == 8) {
            System.out.println(a + "\n31");
        }
        if (a == 9) {
            System.out.println(a + "\n30");
        }
        if (a == 10) {
            System.out.println(a + "\n31");
        }
        if (a == 11) {
            System.out.println(a + "\n30");
        }
        if (a == 12) {
            System.out.println(a + "\n31");
        }
        if (a <= 0 || a > 12) {
            System.out.println("entry not valid");
        }
    }
}
