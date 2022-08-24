package day02_print_statements;

import java.util.Scanner;

public class nonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int number = 0;
        int[] newNums = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j;
            for(j=0;j<nums.length;j++){
                if(j!=i&&nums[i]==nums[j]){
                    break;
                }
            }
            if(j==nums.length){
                newNums[number++]=nums[i];
            }



        }
        System.out.println(newNums[0]);
    }
}
