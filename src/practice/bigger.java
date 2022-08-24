package practice;

import java.util.Scanner;

public class bigger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the a");
        int a=input.nextInt();
        System.out.println("please enter b");
        int b=input.nextInt();
        if(a<b){
            System.out.println(b+" is bigger");
        } else if (b<a) {
            System.out.println(a+" is bigger");
        } else if (a==b) {
            System.out.println(a+" and "+b+" are equal");
        }
    }
}
