package practice;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30};
        int[] nums2 = {5, 10, 15};
        int[] merge = Arrays.copyOf(nums1, 6);
        for (int i = 0; i < 3; i++) {
            merge[i+3] = nums2[i];
        }

        System.out.println(Arrays.toString(merge));

    }
}
