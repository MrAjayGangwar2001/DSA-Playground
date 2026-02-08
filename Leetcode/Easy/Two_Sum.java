package Leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 26;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + ", " + i);
                break;
            }
            map.put(nums[i], i);
        }

        // for (int i : nums) {
        // System.out.print(i + " ");
        // }
        System.out.println(map.values());
        System.out.println(map);

    }
}