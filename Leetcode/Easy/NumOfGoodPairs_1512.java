package Leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

public class NumOfGoodPairs_1512 {

    static int GoodPairs(int[] nums){

        int len = nums.length;
        int pairs = 0;

        

        for (int i = 0; i < len; i++) {
            
            for (int j = i+1; j < len; j++) {
                
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }

        

        return pairs;

    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 3};
        int result = GoodPairs(nums);

        System.out.println(result);
    }
}
