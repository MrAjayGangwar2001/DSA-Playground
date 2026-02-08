package Leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 26;

        // Method 1 Brute force Method 

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Match Found !");
                    System.out.println("The Indexes is : " +i + "," + j);
                }
            }
        }
        // Method 2 Optimized Method with Hashcode
        /* 
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + ", " + i);
                break;
            }
            map.put(nums[i], i);
        }
             */

        

    }
}