package Leetcode.Easy;

import java.util.Arrays;

public class ConcatenateArrayWithReverse_3925 {

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3};

        int[] ans = ConcatenateWithReverse(nums);

        for(int num : ans){
            System.out.print(num+" ");
        }
    }

    private static int[] ConcatenateWithReverse(int[] nums) {
        
        int len = nums.length;

        int[] arr = Arrays.copyOf(nums,  len * 2);

        int idx = len;

        for(int i = len - 1; i >= 0; i--){
            arr[idx++] = nums[i];
        }

        return arr;
    }
}
