package Leetcode.Medium;

class Problem {

    // Optimize Approach by Using Kadane's Algorithm in O(n)
    public int SubArray(int[] nums) {

        int max_sum = nums[0];
        int curr_sum = 0;

        if (nums.length == 1)
            return max_sum;

        for (int i = 0; i < nums.length; i++) {

            curr_sum = Math.max(nums[i], curr_sum + nums[i]);

            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }

        return max_sum;
    }
}

public class Maximum_SubArray_53 {

    public static void main(String[] args) {

        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        Problem pb = new Problem();

        System.out.println(pb.SubArray(nums));

    }
}


// Leetcode Submitted Code...


// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max_sum = nums[0];
//         int curr_sum = 0;
//         if (nums.length == 1) {
//             return nums[0];
//         }
//         // if(nums.length == 2){
//         //     int max = Math.max(nums[0], nums[0] + nums[1]);
//         //     return max; 
//         // }
//         // for (int arr : nums) {
//         for (int i = 0; i < nums.length; i++) {
//             // int reset = 0;
//             curr_sum = Math.max(nums[i], curr_sum + nums[i]);
//             // curr_sum = curr_sum + nums[i];
//             // if (curr_sum < 0) {
//             //     curr_sum = 0;
//             //     // max_sum = 0;
//             // }

//             max_sum = Math.max(max_sum, curr_sum);
//         }
//         return max_sum;
//     }

// }