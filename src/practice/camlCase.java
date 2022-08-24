package practice;

import java.util.Scanner;

public class camlCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your input");
        String input = scan.nextLine().toLowerCase();
        String newInput = "";


        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == ' '){
                newInput += input.substring(i+1,i+2).toUpperCase();
                i++;
            }else {
                newInput += input.charAt(i);
            }

        }

        System.out.println(newInput);
    }
}
