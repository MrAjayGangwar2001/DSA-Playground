package Leetcode.DailyQS;


public class CountSubArrayWithMajorityElement_3737_1 {

    public static void main(String[] args) {

        // int[] nums = { 1, 1, 1, 1 };
        // int target = 1;
        int[] nums = {1, 2, 2, 3};
        int target = 2;
        int Result = CountSubArray(nums, target);

        System.out.println(Result);
    }

    private static int CountSubArray(int[] nums, int target) {

       
        // if (nums.length == 1 && nums[0] == target) {

        //     // System.out.println("Element not found : "+ target );
        //     return 1;
        // }

        int len = nums.length;
        int idx = 0;
        for (int i = 0; i < len; i++) {

            int count = 0;

            for (int j = i; j < len; j++) {

                if (nums[j] == target) {
                    count++;
                }

                int length = j - i + 1;

                // if (count > len / 2) {
                if (2 * count > length) {
                    idx++;
                }
            }
            
        }
        return idx;
    }

}
