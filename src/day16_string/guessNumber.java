package day16_string;

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        int validNumber= 55;
        int count = 0;
        System.out.println(" please guess a number between 1 and 100: ");
        Scanner input = new Scanner(System.in);
        int num=0;
        do {
            num = input.nextInt();
            count++;
            if (num > 55) {
                System.out.println("number is bigger");
                System.out.println(" please guess a number between 1 and 100: ");
            } else if(num<55){
                System.out.println("number is smaller");
                System.out.println(" please guess a number between 1 and 100: ");
            }
        }while ((num!=55));{
            System.out.println("you got it after "+count +" guesses");
        }
    }
}
