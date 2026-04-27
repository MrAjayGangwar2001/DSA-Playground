package Leetcode.Easy;

import java.util.Arrays;

public class TransformArrayByParity_3467 {

    static int[] Transform(int[] nums) {

        // Method 1 Bruteforce , Took 35ms

        int len = nums.length;

        for (int i = 0; i < len; i++) {
        if (nums[i] % 2 == 0) {
        nums[i] = 0;
        }else{
        nums[i] = 1;
        }
        }

        Arrays.sort();
        return nums;
        
        
    }

    public static void main(String[] args) {
        // int nums[] = { 4, 3, 2, 1 };
        int nums[] = { 1, 5, 1, 4, 2 };
        int result[] = Transform(nums);

        for (int arr : result) {
            System.out.print(arr + ",");
        }
    }
}