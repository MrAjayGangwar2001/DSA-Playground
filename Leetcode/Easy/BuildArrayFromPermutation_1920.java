package Leetcode.Easy;

public class BuildArrayFromPermutation_1920 {

    public static void main(String[] args) {
        
        // int[] nums = {0,2,1,5,3,4};   // 0 1 2 4 5 3 
        int[] nums = {5,0,1,2,3,4};      // 4 5 0 1 2 3 

        int[] ans = BuildArray(nums);
        
        for (int n : ans) {
             System.out.print(n+" ");
        }
    }

    private static int[] BuildArray(int[] nums) {
        
        int len = nums.length;

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            
            arr[i] = nums[nums[i]];
        }

        return arr;
    }
}
