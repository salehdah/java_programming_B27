package practice;

import java.util.Scanner;

public class salesBonus {
    public static void main(String[] args) {
        Scanner sale=new Scanner(System.in);
        System.out.println("please enter your sales amount");
        double a=sale.nextDouble();
        if (a<10000){
            System.out.println("you dont get any bonus");
        } else if (a>=10000 && a<15000) {
            System.out.println(" your bonus is $5000");
        } else if (a>=15000) {
            System.out.println("your bonus is $7000");
            
        }
    }
}
