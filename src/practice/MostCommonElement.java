package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MostCommonElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the length of each single array: ");
        int length = input.nextInt();
        System.out.println("please enter how many arrays you want to use ");
        int rows = input.nextInt();
        int[][] table = new int[rows][length];
        for (int i = 0; i < rows; i++) {
            System.out.println("please enter the elements of array number: " + (i + 1));
            for (int j = 0; j < length; j++) {
                System.out.println("the " + (j + 1) + " element is");
                table[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(table));
for (int i=0;i<length;i++){
    int count=0;
    for (int j=1;j<rows;j++){
        for (int k=0;k<length;k++){
            if (table[0][i]==table[j][k]){
                count++;
                break;
            }
        }

    }
    if (count==rows-1){
        System.out.println(table[0][i]);
    }
}

    }
}