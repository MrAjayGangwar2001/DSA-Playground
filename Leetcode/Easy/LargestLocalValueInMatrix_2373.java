package Leetcode.Easy;

public class LargestLocalValueInMatrix_2373 {

    public static int[][] largestLocal(int[][] grid) {

        int len = grid.length;

        int[][] arr = new int[len - 2][len - 2];

        for (int i = 0; i < len - 2; i++) {

            for (int j = 0; j < len - 2; j++) {
                int max = 0;

                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                       
                        max = Math.max(max, grid[x][y]);
                    }
                }

                arr[i][j] = max;

            }

        }

        for (int i = 0; i < arr.length; i++) {
            int colLen = arr[i].length;

            for (int j = 0; j < colLen; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };
        // int Len = arr.length;
        // int[][] nums = new int[Len - 2][Len - 2];

        largestLocal(arr);
        // for (int i = 0; i < nums.length; i++) {
        // int colLen = nums[i].length;

        // for (int j = 0; j < colLen; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }
    }

}