package Leetcode.Easy;

public class RichestCustomerWealth_1672{

    static int MaximumWealth(int[][] accounts){


        int RowLen = accounts.length;

        int maxSum = 0;
        
        for (int i = 0; i < RowLen; i++) {
            
            int ColLen = accounts[i].length;
            
            int sum = 0;
            for (int j = 0; j < ColLen; j++) {
                
                sum += accounts[i][j];

            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }

    public static void main(String[] args) {

        int [][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int [][] TestCase = {{1, 5}, {7, 3}, {3, 5}};
        int [][] TestCase2 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int result = MaximumWealth(accounts);
        int result2 = MaximumWealth(TestCase);
        int result3 = MaximumWealth(TestCase2);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}