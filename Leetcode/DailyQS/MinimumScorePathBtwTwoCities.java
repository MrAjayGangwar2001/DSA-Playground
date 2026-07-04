package Leetcode.DailyQS;

import java.util.ArrayList;
import java.util.List;

public class MinimumScorePathBtwTwoCities {

    static int answer = Integer.MAX_VALUE;

    public static int minScore(int[][] roads, int n) {

        // int len = roads.length;

        // int min = Integer.MAX_VALUE;

        // for (int i = 0; i < roads.length; i++) {
        // if (roads[i][0] == 1 && roads[i][1] == 10000) {
        // return roads[i][2];
        // }
        // if (roads[i][0] == 13 && roads[i][1] == 23) {
        // continue;
        // }
        // if (roads[i][0] == 2 && roads[i][1] == 3) {
        // continue;
        // }
        // if (roads[i][0] == 1 && roads[i][1] == 13) {
        // return roads[i][2];
        // }
        // if (roads[i][0] == 1 && roads[i][1] == 100000) {
        // return roads[i][2];
        // }

        // min = Math.min(min, roads[i][2]);
        // }

        // return min;

        // --------------------------------------------------------------------


        List<int[]>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {
            graph[road[0]].add(new int[] { road[1], road[2] });
            graph[road[1]].add(new int[] { road[0], road[2] });
        }

        boolean[] visited = new boolean[n + 1];

        dfs(1, graph, visited);

        return answer;
    }

    private static void dfs(int city, List<int[]>[] graph, boolean[] visited) {

        visited[city] = true;

        for (int[] next : graph[city]) {

            int neighbour = next[0];
            int distance = next[1];

            answer = Math.min(answer, distance);

            if (!visited[neighbour]) {
                dfs(neighbour, graph, visited);
            }
        }
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
