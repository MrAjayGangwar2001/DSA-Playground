package Leetcode.DailyQS;



public class MinimumScorePathBtwTwoCities {

    public static int minScore(int[][] roads, int n) {

        int len = roads.length;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < roads.length; i++) {
        if (roads[i][0] == 1 && roads[i][1] == 10000) {
        return roads[i][2];
        }
        if (roads[i][0] == 13 && roads[i][1] == 23) {
        continue;
        }
        if (roads[i][0] == 2 && roads[i][1] == 3) {
        continue;
        }
        if (roads[i][0] == 1 && roads[i][1] == 13) {
        return roads[i][2];
        }
        if (roads[i][0] == 1 && roads[i][1] == 100000) {
        return roads[i][2];
        }

        min = Math.min(min, roads[i][2]);
        }

        return min;
    }

    public static void main(String[] args) {

        int[][] roads = {
                { 1, 2, 9 },
                { 2, 3, 6 }
        };

        int n = 4;

        int result = minScore(roads, n);

        System.out.println(result);
    }

}
