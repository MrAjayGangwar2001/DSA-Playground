package Leetcode.DailyQS;

public class LongestSubsequenceWithNonZeroBitwiseXOR_3702 {

    public static void main(String[] args) {

        // int[] nums = { 2, 3, 4 };
        int[] nums = { 1, 2, 3 };

        int Result = LongestSubsequenceWithNonZero(nums);
        int Method2 = longestSubsequence(nums);

        System.out.println(Result);
        System.out.println(Method2);
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

    public static int longestSubsequence(int[] nums) {

        int n = nums.length;
        int xor = 0;
        boolean hasNonZero = false;

        for (int num : nums) {
            xor ^= num;

            if (num != 0) {
                hasNonZero = true;
            }
        }

        // Entire array has non-zero XOR
        if (xor != 0) {
            return n;
        }

        // Entire array XOR is 0,
        // but at least one non-zero element exists
        if (hasNonZero) {
            return n - 1;
        }

        // All elements are 0
        return 0;
    }

}