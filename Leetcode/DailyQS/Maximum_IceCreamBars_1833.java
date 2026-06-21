package Leetcode.DailyQS;

public class Maximum_IceCreamBars_1833 {

    private static int MaxCreamBars(int[] costs, int coins) {

        int max = 0;

        for (int num : costs) {

            max = Math.max(max, num);
        }

        int[] nums = new int[max + 1];

        for (int n : costs) {

            nums[n]++;
        }

        int count = 0;

        // for (int i = 1; i <= max; i++){

        // while (nums[i] > 0 && coins >= i) {
        // nums[i]--;

        // coins -= i;

        // count++;
        // }
        // }

// More Optimised-----

        for (int cost = 1; cost <= max; cost++) {

            if (nums[cost] == 0) {
                continue;
            }

            int canBuy = Math.min(nums[cost], coins / cost);

            count += canBuy;
            coins -= canBuy * cost;
        }

        return count;
    }

    public static void main(String[] args) {

        // int[] costs = {10,6,8,7,7,8};
        // int coins = 5; // Ans: 0
        int[] costs = { 1, 6, 3, 1, 2, 5 };
        int coins = 20; // Ans : 6
        // int[] costs = {1, 3, 2, 4, 1};
        // int coins = 7; // Ans : 4

        int Result = MaxCreamBars(costs, coins);

        System.out.println("Result : " + Result);
    }

}
