package day10_if_statement;

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if((n%3==0)&&(n%5==0)){
            System.out.println("n = "+n+"\nfizzbuzz");
        } else if (n%5==0) {
            System.out.println("n = "+n+"\nbuzz");

        } else if (n%3==0) {
            System.out.println("n = "+n+"\nfizz");

        }else {
            System.out.println("n = "+n);
        }
    }
}
