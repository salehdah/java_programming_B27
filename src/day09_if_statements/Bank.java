package day09_if_statements;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        double amountToWithdraw = input.nextDouble();
        balance -=amountToWithdraw;
        System.out.println("withdraw: "+ amountToWithdraw);
        if (balance>=0){
            System.out.println(" my balance is "+ balance);
        }
        if (balance<0){
            System.out.println("overdraft penalty");
            System.out.println("overdraft fee is: "+ amountToWithdraw*0.25);
        }
    }
}
