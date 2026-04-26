package Leetcode.Easy;

public class ComputeAlternativeSum_3701 {

    static int AlternatingSum(int[] nums){

        int len = nums.length;
        int sum = 0;


        if(len == 1){
            return nums[0];
        }

        for (int i = 0; i < len -1; i +=2) {
            
            sum += nums[i] - nums[i + 1];
        }

        if (len % 2 != 0) {
            sum += nums[len-1];
        }

        // Another Method ---

        // int sign = 1;

        // for(int arr : nums){
        //     sum += sign * arr;

        //     sign *= -1;
        // }

        return sum;
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7};
        // int nums1[] = {100};
        int result = AlternatingSum(nums);
        // int result1 = AlternatingSum(nums1);

        System.out.println(result);
        // System.out.println(result1);
    }
}
