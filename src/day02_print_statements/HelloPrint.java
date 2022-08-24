package day02_print_statements;

import java.util.Arrays;
import java.util.Scanner;

public class HelloPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count=0;
        int[] newNumber= new int[nums.length];
for(int i=0;i< nums.length;i++) {
    int j;
    for (j = 0; j < nums.length; j++) {
        if (i != j && nums[i] == nums[j]) {
            break;
        }

    }
    if (j == nums.length) {
        newNumber[count++] = nums[i];
    }
}
System.out.println(newNumber[0]);
}
    }

