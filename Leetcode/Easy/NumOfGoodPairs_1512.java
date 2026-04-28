package Leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

public class NumOfGoodPairs_1512 {

    static int GoodPairs(int[] nums){

        int len = nums.length;
        int pairs = 0;

        // Method 1 Basic and Brute force and took 2 ms Runtime

        // for (int i = 0; i < len; i++) {
            
        //     for (int j = i+1; j < len; j++) {
                
        //         if (nums[i] == nums[j]) {
        //             pairs++;
        //         }
        //     }
        // }

        // Method 2 Optimized Using Collection took 0ms Runtime

        Map<Integer, Integer> mp = new HashMap<>();

        for (int arr : nums) {
            
            int count = mp.getOrDefault(arr, 0);

            pairs += count;

            mp.put(arr, count +1);
        }

        return pairs;

    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 3};
        int result = GoodPairs(nums);

        System.out.println(result);
    }
}
