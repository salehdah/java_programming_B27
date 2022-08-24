package day16_string;

import java.util.Scanner;

public class positiveNegativeCount {
    public static void main(String[] args) {
        int num =5;
        int positiveNums = 0;
        int negativeNums =0;
        while(num>0){
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            if(num1>=0){
                positiveNums++;
            }else {
                negativeNums++;
            }
            num--;
        }
        System.out.println(" positive numbers are: "+positiveNums);
        System.out.println(" negative numbers are: "+negativeNums);
    }
}
