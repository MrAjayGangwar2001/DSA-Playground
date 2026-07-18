

import java.util.Arrays;

public class GCDOfArray_1979 {

    public static void main(String[] args) {
        // int[] nums = { 2, 5, 6, 9, 10 };
        int[] nums = {7,5,6,8,3};
        int Result = findGCD(nums);

        System.out.println(Result);

        System.out.println(findGCD2(nums));
    }

    private static int findGCD(int[] nums) {

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            low = Math.min(nums[i], low);
            high = Math.max(nums[i], high);
        }

        while (high != 0) {

            int temp = high;
            high = low % high;
            low = temp;
        }

        return low;
    }

    private static int findGCD2(int[] nums) {

        Arrays.sort(nums);

        int low = nums[0];
        int high = nums[nums.length - 1];

        while(high != 0){

            int temp = high;
            high = low % high;
            low = temp;
        }

        return low;
    }
}
