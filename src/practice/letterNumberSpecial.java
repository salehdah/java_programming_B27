package practice;

import java.util.Scanner;

public class letterNumberSpecial {
    public static void main(String[] args) {
        Scanner car=new Scanner(System.in);
        System.out.println("please enter a character");
        char ch=car.next().charAt(0);
        if((ch>=33 && ch<=47) ||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=126)){
            System.out.println(ch+" is a special character");
        } else if (ch>=48 && ch<=57) {
            System.out.println(ch+" is a number");
        } else if ((ch>=65 && ch<=90)||(ch>=97 && ch<=122)) {
            System.out.println(ch+" is a letter");
            
        }


    }
}
