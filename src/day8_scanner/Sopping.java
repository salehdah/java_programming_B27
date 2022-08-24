package day8_scanner;
import java.util.Scanner;
public class Sopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the item name");
        String item = input.next();
        System.out.println("what is your item price ");
        double price = input.nextDouble();
        System.out.println("how many "+ item+"/s do you want");
        int quantity = input.nextInt();
        System.out.println("your total for "+ quantity+ " "+item+ "/s is "+quantity*price);

    }
}
