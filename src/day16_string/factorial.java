package day16_string;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        int product =num;
        while(num>=2){
            product*=--num;
        }
        System.out.println(product);

    }

}
