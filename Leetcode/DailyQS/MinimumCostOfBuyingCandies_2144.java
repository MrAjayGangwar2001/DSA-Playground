
import java.util.Arrays;

public class MinimumCostOfBuyingCandies_2144 {

    public static int MinCostBuyCandy(int[] cost) {

        Arrays.sort(cost);

        for (int i = 0, j = cost.length - 1; i < j; i++, j--) {
            int temp = cost[i];
            cost[i] = cost[j];
            cost[j] = temp;
        }

        int sum = 0;
        for (int k = 0; k < cost.length; k += 3) {

            if (cost.length % 3 != 0 && k == cost.length - 1) {
                sum += cost[k];
            } else {

                sum += cost[k] + cost[k + 1];
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        int[] cost = { 6, 5, 7, 9, 2, 2 };

        int result = MinCostBuyCandy(cost);
        System.out.println(result);
    }

}
