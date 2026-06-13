package Leetcode.Medium;

import java.util.Arrays;

public class FindScoreOfArrayAfterMarkingAll_2593 {

    public static long FindScore(int[] nums) {

        int len = nums.length;

        boolean[] arr = new boolean[len];
        Arrays.fill(arr, true);

        int[][] pair = new int[len][2];

        for (int i = 0; i < len; i++) {

            pair[i][0] = nums[i];
            pair[i][1] = i;
        }

        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));

        long sum = 0;
        for (int j = 0; j < len; j++) {

            int value = pair[j][0];
            int idx = pair[j][1];

            if (!arr[idx])
                continue;

            sum += value;

            if (idx > 0)
                arr[idx - 1] = false;

            if (idx < len - 1)
                arr[idx + 1] = false;

        }

        return sum;
    }

    public static void main(String[] args) {
        
        // input = { 4, 1, 6, 2, 3, 5 };
        // output = 1 + 2 + 5 = 8

        // int[] nums = { 4, 1, 6, 2, 3, 5 };
        // int[] nums = { 2, 1, 3, 4, 5, 2 };  // 7
        int[] nums = { 2, 3, 5, 1, 3, 2 };  // 5

        long result = FindScore(nums);

        System.out.print(result);
    }
}
