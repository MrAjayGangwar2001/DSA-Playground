import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Solution {

    // Method 1 with brute force but it will not a valid solution
    public boolean method_1(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }

            }
        }
        return false;

    }

    // METHOD 2 BY USING LIST
    public boolean method_2(int[] nums) {

        List<Integer> ls = new ArrayList<>();

        for (Integer arr : nums) {
            if (ls.contains(arr)) {
                return true;
            } else {
                ls.add(arr);
            }
        }
        return false;
    }

    // METHOD 3 BY USING SET
    public boolean method_3(int[] nums) {

        Set<Integer> st = new HashSet<>();

        for (int arr : nums) {
            if (!st.add(arr)) {
                return true;
            }
        }
        return false;
    }
}

public class Contains_Duplicate_217 {
    public static void main(String args[]) {
        Solution s = new Solution();

        // Test cases....
        // int [] nums = {1, 2, 3, 1};
        // int [] nums = {1, 2, 3, 4};
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };


        // s.containsDuplicate(nums);
        // System.out.println(s.method_1(nums));
        // System.out.println(s.method_2(nums));
        System.out.println(s.method_3(nums));

    }
}