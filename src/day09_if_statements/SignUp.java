package day09_if_statements;

import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your full name");
        String fullNmae = input.nextLine();
        System.out.println("enter your email");
        String email = input.next();
        System.out.println("enter your age");
        int age =input.nextInt();
        System.out.println("do you want to sign up for the extra newsletter T/F");
        boolean extra = input.nextBoolean();
        input.nextLine();
        System.out.println("how did you hear about us");
        String hearAboutUs = input.nextLine();
        String confirm = fullNmae + " you signed up with email: " + email + ". We are glad to get reader at age  " + age + " you signed up for extra newsletter " + extra + " credit goes to "+ hearAboutUs;
        System.out.println(confirm);
    }
}
