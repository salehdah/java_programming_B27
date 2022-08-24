package practice;

import java.util.Scanner;

public class theBiggest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a");
        int a=scan.nextInt();
        System.out.println("please enter b");
        int b=scan.nextInt();
        System.out.println("please enter c");
        int c=scan.nextInt();
        if(a<c && b<c){
            System.out.println(c+" is the biggest");
        } else if (a<b && c<b) {
            System.out.println(b+" is the biggest");
        } else  {
            System.out.println(a+" is the biggest");

        }
    }
}
