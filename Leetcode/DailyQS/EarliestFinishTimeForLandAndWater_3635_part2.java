package Leetcode.DailyQS;
import java.util.Arrays;

public class EarliestFinishTimeForLandAndWater_3635_part2 {

    private static int solve(int[] landStartTime,
            int[] landDuration,
            int[] waterStartTime,
            int[] waterDuration) {

        int minTime = Integer.MAX_VALUE;

        int[][] arr = new int[waterStartTime.length][2];

        for (int i = 0; i < waterStartTime.length; i++) {
            arr[i][0] = waterStartTime[i];
            arr[i][1] = waterDuration[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int[] preffix = new int[waterStartTime.length];
        int[] suffix = new int[waterDuration.length];

        preffix[0] = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            preffix[i] = Math.min(preffix[i - 1], arr[i][1]);
        }

        int len = arr.length;

        suffix[len - 1] = arr[len - 1][0] + arr[len - 1][1];

        for (int j = len - 2; j >= 0; j--) {
            suffix[j] = Math.min(suffix[j + 1], arr[j][0] + arr[j][1]);
        }

        for (int i = 0; i < landStartTime.length; i++) {

            int landTime = landStartTime[i] + landDuration[i];

            // Binary Search-----

            int low = 0;
            int high = len - 1;
            int pos = len;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[mid][0] > landTime) {
                    pos = mid;

                    high = mid - 1;
                } else {
                    low = mid + 1;

                }
            }

            if (pos > 0) {

                int candidate1 = landTime + preffix[pos - 1];
                minTime = Math.min(minTime, candidate1);

            }

            if (pos < len) {

                int candidate2 = suffix[pos];

                minTime = Math.min(minTime, candidate2);
            }
        }

        return minTime;
    }

    public static void main(String[] args) {

        int[] landStartTime = { 2, 8 };
        int[] landDuration = { 4, 1 };
        int[] waterStartTime = { 6 };
        int[] waterDuration = { 3 };

        int answer1 = solve(landStartTime,
                landDuration,
                waterStartTime,
                waterDuration);

        int answer2 = solve(waterStartTime,
                waterDuration,
                landStartTime,
                landDuration);

    

        int result = Math.min(answer1, answer2);

        
        System.out.println(result);
    }

}
