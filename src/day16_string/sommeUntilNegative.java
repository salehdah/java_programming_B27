package day16_string;

import java.util.Scanner;

public class sommeUntilNegative {
    public static void main(String[] args) {
        System.out.println("Enter a positive number, or negative number to end");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        do {
            num = scanner.nextInt();
           if (num>=0) sum+= num;
            System.out.println("Enter a positive number, or negative number to end");

        } while (num >= 0);

        System.out.println("The total is: " + sum);


    }
}
