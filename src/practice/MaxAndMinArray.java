package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] table1= new int[4];
       int[] table2= new int[4];
       int[] table3= new int[4];
        int[][] whole ={table1,table2,table3};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                whole[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(whole));
        int max=whole[1][0];
        int min=whole[2][1];
        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                if(whole[i][j]>max){
                    max=whole[i][j];
                }
                if(whole[i][j]<min){
                    min=whole[i][j];
                }
            }
        }
        System.out.println("the maximum is: "+max);
        System.out.println("the minimum is: "+min);
    }
}
