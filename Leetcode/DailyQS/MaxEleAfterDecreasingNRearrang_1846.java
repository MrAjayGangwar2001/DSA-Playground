package Leetcode.DailyQS;

import java.util.Arrays;

public class MaxEleAfterDecreasingNRearrang_1846 {

    public static void main(String[] args) {
        
        // int[] arr = {100, 1, 1000};
        int[] arr = {1, 5, 13, 3, 78, 3, 7, 14, 568, 1, 3};
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {2, 2, 1, 2, 1};

        
        int Result = FindMaxElement(arr);

        System.out.println("Result : "+Result);
    }

    private static int FindMaxElement(int[] arr) {
        int len = arr.length;

        Arrays.sort(arr);
        arr[0] = 1;

        for(int i = 1; i < len; i++){

            int diff = arr[i] - arr[i - 1];

            if(diff > 1){
                
                arr[i] = arr[i - 1] + 1;
            }
        }

       
        return arr[len - 1];
    }

}
