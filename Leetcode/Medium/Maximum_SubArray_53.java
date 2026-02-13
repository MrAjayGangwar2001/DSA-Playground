package Leetcode.Medium;

class Problem{

    public int SubArray(int [] nums){

        int max_sum = nums[0];
        int curr_sum = 0;

        if(nums.length == 1) return max_sum;

        // for (int arr : nums) {
            for(int i = 0; i < nums.length; i++){

                curr_sum = Math.max(nums[i], curr_sum + nums[i]);
                max_sum = Math.max(max_sum, curr_sum);
            }
        
            return max_sum;
    }
}

public class Maximum_SubArray_53 {

    public static void main(String[] args) {
        
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        Problem pb = new Problem();

        System.out.println(pb.SubArray(nums));
        
    }
}




// nums =
// [-2,1,-3,4,-1,2,1,-5,4]
// Output
// 4
// Expected
// 6
