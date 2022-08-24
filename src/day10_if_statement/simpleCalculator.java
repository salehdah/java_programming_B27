package day10_if_statement;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the first number ");
        double numOne=input.nextDouble();
        System.out.println("please enter the second number");
        double numTwo=input.nextDouble();
        System.out.println("please enter the operator");
        char operator=input.next().charAt(0);
        double result=0;
        if (operator=='+'){
            result=numOne+numTwo;
        } else if (operator=='-') {
            result=numOne-numTwo;

        } else if (operator=='*') {
            result=numOne*numTwo;
        } else if (operator=='/') {
            result=numOne/numTwo;
        }
        System.out.println(""+numOne+operator+numTwo+"="+result);
    }
}
