package Leetcode.Easy;

class Problem {
    public int Method_1(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;    // It Takes Maximum Value Of Integer(2147483647)
        int end = (prices.length - 1);

        for (int i = 0; i <= end; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];

            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;

    }

    
}

public class Time_to_buy_Sell_Stock_121 {
    public static void main(String[] args) {

        int prices[] = {7, 1, 5, 3, 6, 4};
        Problem pl = new Problem();
        System.out.println(pl.Method_1(prices));
        

    }
}
