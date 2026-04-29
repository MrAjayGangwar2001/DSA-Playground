package Leetcode.Easy;

public class ShuffleArray_1470 {

    static int[] Shuffle(int[] nums, int n){

        int len = nums.length;
        int[] result = new int[len];

    // Basic Bruteforce Method/Approach
        /*
        int[] X = new int[n];
        int [] Y = new int[n];

        for (int i = 0; i < n; i++) {
            X[i] = nums[i];
            Y[i] = nums[n + i];
        }

        int idx = 0;
        for (int j = 0; j < len; j+=2) {
            result[j] = X[idx];
            result[j+1] = Y[idx];
            idx++;
        }
        */


    

        return result;
    }

    static void main() {
       int[] testCase = {2, 5, 1, 3, 4, 7};
        

        int[]  result = Shuffle(testCase, 4);

        for (int i : result) {
            System.out.print(i + ",");
        }
    }
}
