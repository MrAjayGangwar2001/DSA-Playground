package Leetcode.DailyQS;

import java.util.ArrayList;
import java.util.List;

public class SmallestMisingIntegerGreaterSequentialPerfixSum_2996 {

    public static int FindSmallestMissingNumber(int[] nums){

        int len = nums.length;

        List<Integer> ls = new ArrayList<>();

        for(int num : nums){
            ls.add(num);
        }

        int idx = 0;
        int totalLen = nums[0];
        int sum = 0;
        for(int i = totalLen; i < totalLen + len; i++){

            if (nums[idx] != i) {
                break;
            }

            sum += nums[idx];
            idx++;
        }

        int missing = sum;
        if (!ls.contains(missing)) {
            return missing;
        }

        while (ls.contains(missing)) {
            
            missing++;
        }

        return missing;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,2,5};

        int Result = FindSmallestMissingNumber(nums);

        System.out.println(Result);
    }
}
