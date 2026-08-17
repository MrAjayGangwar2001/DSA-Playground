package Leetcode.DailyQS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElements_3731 {

    public static void main(String[] args) {
        
        int[] nums = {1, 4, 2, 5};

        List<Integer> ls = FindElements(nums);

        System.out.println(ls);
    }

    private static  List<Integer> FindElements(int[] nums){

         List<Integer> ls = new ArrayList<>();
        int len = nums.length;

        if (nums == null || len == 0) return ls;
        // Arrays.sort(nums);
        Set<Integer> st = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            st.add(n);

            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        

        // int min = nums[0];
        // int max = nums[len - 1];

        int idx = 0;
        for(int i = min; i <= max; i++){

            if(!st.contains(i)){
                ls.add(i);
            }
            // if(nums[idx] == i){
            //     idx++;
            // }else{

            //     ls.add(i);
            // }
        }

        return ls;
    }
}
