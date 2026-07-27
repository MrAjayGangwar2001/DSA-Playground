package Leetcode.DailyQS;

import java.util.Arrays;

public class MaxProductOfTwoElementInArray_1464 {

    public static void main(String[] args) {

        // int[] nums = { 3, 4, 5, 2 };
        int[] nums = {1,5,4,5};

        int ans = MaxProductM1(nums);

        System.out.println(ans);

    }

    private static int MaxProductM1(int[] nums) {

        int len = nums.length;

        Arrays.sort(nums);

        int ans = (nums[len - 1] - 1) * (nums[len - 2] - 1);

        return ans;
    }

    

}
