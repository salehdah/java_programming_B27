package day09_if_statements;

import java.util.Scanner;

public class PayDay {
    public static void main(String[] args) {
        double netPay;
        Scanner input = new Scanner(System.in);
        System.out.println("please the hourly rate");
        double hourlyRate = input.nextDouble();
        System.out.println("please enter the number of hours per week" );
        int hoursPerWeek = input.nextInt();
        if (hoursPerWeek > 40) {
            int overTime= hoursPerWeek-40;
            netPay=hourlyRate*40;
            netPay += hourlyRate*overTime*1.5;


        } else {
            netPay = hourlyRate * hoursPerWeek;
        }
        System.out.println("the net pay is: $"+netPay);
    }
}
