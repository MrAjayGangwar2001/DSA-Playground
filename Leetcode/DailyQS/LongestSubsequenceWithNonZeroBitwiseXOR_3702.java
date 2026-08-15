package Leetcode.DailyQS;

public class LongestSubsequenceWithNonZeroBitwiseXOR_3702 {

    public static void main(String[] args) {

        // int[] nums = { 2, 3, 4 };
        int[] nums = {1, 2, 3 };

        int Result = LongestSubsequenceWithNonZero(nums);

        System.out.println(Result);
    }

    private static int LongestSubsequenceWithNonZero(int[] nums) {

        int len = nums.length;

        int xor = 0;

        for (int n : nums) {

            xor ^= n;
        }

        if (xor != 0) {
            return len;
        }

        for (int num : nums) {

            xor ^= num;

            if (num != 0) {
                return len - 1;
            }
        }

        return xor;
    }



    
}