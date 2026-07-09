package Leetcode.DailyQS;

import java.util.Arrays;
import javax.sound.sampled.SourceDataLine;

public class PathExistanceQueriesInGraph_3532 {

    public static void main(String[] args) {
        
        int n = 2;
        int[] nums = { 1, 3 };
        int maxDiff = 1;
        int[][] queries = { {0,0}, {0,1} };


        boolean[] result = PathExistance(n, nums, maxDiff, queries);

        for(boolean check : result){
            System.out.print(check+" ");
        }

    }

    private static boolean[] PathExistance(int n, int[] nums, int maxDiff, int[][] queries) {

        int len = queries.length;

        int[] arr = new int[n];
        arr[0] = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                arr[i] = arr[i - 1];
            }else{
                arr[i] = arr[i - 1] + 1;
            }
        }

        boolean[] ans = new boolean[len];

        Arrays.fill(ans, false);


        for (int j = 0; j < len; j++) {
            int u = queries[j][0];
            int v = queries[j][1];

            if(arr[u] == arr[v]){
                ans[j] = true;
            }
        }

        return ans;
    }
}
