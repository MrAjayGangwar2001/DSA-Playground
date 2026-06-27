package Leetcode.DailyQS;

public class CountSubArrayWithMajority_Part2 {

    public static long MaximumSubArray(int[] nums, int target) {

        int len = nums.length;
        int[] arr = new int[len * 2 + 1];
        arr[len] = 1;
        int temp = len;
        long count = 0;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                sum += arr[temp];
                temp++;
                arr[temp]++;
            } else {
                temp--;
                sum -= arr[temp];
                arr[temp]++;
            }
            count += sum;
        }
    
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3};
        int target = 2;

        long result = MaximumSubArray(nums, target);

        System.out.println("Result : "+result);

    }

}
