package practice;
import java.util.Scanner;

public class revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the price");
        double price = input.nextDouble();
        //Scanner //input = new Scanner(System.in);
       // System.out.println("please enter the quantity");
        int quantity = input.nextInt();
        double revenue = price * quantity;
        System.out.println("the revenue is " + revenue);
    }

}
