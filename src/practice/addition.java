package practice;
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner first= new Scanner (System.in);
        System.out.println("please enter a number");
        int a= first.nextInt();
        Scanner second= new Scanner (System.in);
        System.out.println("please enter a number");
        int b= second.nextInt();
        int c=a+b;
        System.out.println("the total of  "+ a +" and " + b +" is "+ c);

    }
}
