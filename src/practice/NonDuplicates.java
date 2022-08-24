package practice;

import java.util.*;

public class NonDuplicates {
    public  int kthSmallest(int[][] matrix, int k) {
    /*    int[] arr =new int [matrix.length*matrix.length];
        int h=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++) {

                    arr[h++] = matrix[i][j];

            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];*/
        int n=matrix.length;
        int low=matrix[0][0];
        int high = matrix[n-1][n-1];

        while(low<high){
            int mid = (high+low)/2;
            int count = partition(matrix,mid);
            if(count<k){
                low=mid+1;
            }else {
                high=mid;
            }
        }
        return low;


    }
    public  int partition(int[][] matrix,int target){
        int count=0;
        int i = matrix.length-1,j=0;
        while(i>=0&&j<matrix.length){
            if(matrix[i][j]>target){
                i--;
            }else{
                count += i+1;
                j++;
            }
        }
        return count;
    }

      public static void main(String[] args) {
          int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
          NonDuplicates obj = new  NonDuplicates();
          System.out.println(obj.kthSmallest(matrix,8));
      }
}
