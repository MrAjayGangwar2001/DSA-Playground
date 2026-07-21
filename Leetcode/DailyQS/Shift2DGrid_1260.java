package Leetcode.DailyQS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shift2DGrid_1260 {

    public static void main(String[] args) {

        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<List<Integer>> ls = ShiftedGrid(grid);
        System.out.println(ls);
    }

    private static java.util.List<java.util.List<Integer>> ShiftedGrid(int[][] grid) {
     

    // public Static List<List<Integer>> ShiftedGrid(int[][] grid) {

        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {

            int colLen = grid[i].length;

            for (int j = 0; j < colLen; j++) {

                ls.add(grid[i][j]);
            }
        }

        Collections.rotate(ls, 1);

        List<List<Integer>> list = new ArrayList<>();

        int idx = 0;
        for (int i = 0; i < grid.length; i++) {
            int colLen = grid[i].length;
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < colLen; j++) {

                row.add(ls.get(idx++));
            }

            list.add(row);
        }

        // System.out.println(list);

        return list;
    }
}
