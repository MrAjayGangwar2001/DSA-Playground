package Leetcode.DailyQS;

import java.util.Arrays;

public class MaxProductOfTwoElementInArray_1464 {

    public static void main(String[] args) {

        // int[] nums = { 3, 4, 5, 2 };
        int[] nums = {1,5,4,5};

        int ans = MaxProductM1(nums);
        int ans2 = MaxProductM2(nums);

        System.out.println(ans);
        System.out.println(ans2);

    }

    private static int MaxProductM1(int[] nums) {

        int len = nums.length;

        Arrays.sort(nums);

        int ans = (nums[len - 1] - 1) * (nums[len - 2] - 1);

        return ans;
    }

    private static int MaxProductM2(int[] nums) {

        int len = nums.length;

        int max = 0, max2 = 0;

        for (int num : nums) {
            
            if (num >= max) {
                max2 = max;
                max = num;
            } else if(num >= max2){
                max2 = num;
            }
        }

        int ans = (max - 1) * (max2 - 1);

        return ans;
    }

}
