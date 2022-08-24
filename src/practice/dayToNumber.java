package practice;

import java.util.Scanner;

public class dayToNumber {
    public static void main(String[] args) {
        Scanner numb=new Scanner(System.in);
        System.out.println("please enter a number between 1 & 7");
        int a=numb.nextInt();
        if (a==1){
            System.out.println(" it's moday");
        }
        if (a==2){
            System.out.println("it's tuesday");
        }
        if (a==3){
            System.out.println("it's wednesday");
        }
        if (a==4){
            System.out.println("its tursday");
        }
        if (a==5){
            System.out.println("it's friday");
        }
        if (a==6){
            System.out.println("it's saturday");
        }
        if (a==7){
            System.out.println("it's sunday" );
        }
        if (a<=0 || a>7){
            System.out.println("Not a valid number");
        }
    }
}
