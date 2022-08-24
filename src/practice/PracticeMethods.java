package practice;

import java.util.Scanner;

public class PracticeMethods {
        public static void OddNumbersMethod(){
            for (int i=0;i<=100;i++){
                if (i%2==1){
                    System.out.print(i+" ");
                }
            }
    }

    public static void EvenNumbersMethod(){
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void PrintChar(){
            for (char i='A';i<='Z';i++){
                System.out.print(i+" ");
            }
        System.out.println("");
            for (char i='Z';i>='A';i--){
                System.out.print(i+" ");
            }
        System.out.println("");
            for (char i='a';i<='z';i++){
                System.out.print(i+" ");
            }
        System.out.println("");
            for (char i='z';i>='a';i--){
                System.out.print(i+" ");
            }
        System.out.println("");
            for (int i=0;i<=10;i++){
                System.out.print(i+" ");
            }
        System.out.println("");
        for (int i=10;i>=0;i--){
            System.out.print(i+" ");
        }
    }
    public static void CanYouVote(int age){
        if (age>=18){
            System.out.println("You can vote");
        }else {
            System.out.println("You cannot vote");
        }
    }
    public static void PositiveNegativeZero(int number){
        if (number>0){
            System.out.println("this number is positive");
        } else if (number<0) {
            System.out.println("This number is negative");

        }else {
            System.out.println("This number is zero");
        }
    }
    public static void PrintChar(String word){
            for (int i=0;i<word.length();i++){
                System.out.println(word.charAt(i));
            }
    }




    public static void main(String[] args) {

            PrintChar("Ahmed Salem Saleh");

    }




}

