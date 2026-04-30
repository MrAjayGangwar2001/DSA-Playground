package Leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

public class TwoSneakyNumOfDisiteVille_3289{

    static int[] getNumbers(int [] nums){

        int len = nums.length;

        int arr[] = new int[2];
        int idx = 0;

    // Method 1 Bruteforce Method----- Runtime 1 Ms good for Small input

        // for (int i = 0; i < len; i++) {
            
        //     for (int j = i+1; j < len; j++) {
                
        //         if (nums[i] == nums[j]) {
        //             arr[idx++] = nums[i];

        //             if (idx == 2) break;
        //         }
        //     }
        // }

    // Method 2 By Using Collection (Set), took 2 ms best for Large input---> O(n)

    Set<Integer> st = new HashSet<>();

    for (Integer num : nums) {
        
        if (!st.add(num)) {
            arr[idx++] = num;

            if(idx == 2) break;
        }
    }

        return arr;
    }

    public static void main(String[] args) {
        int case1[] = {0, 1, 1, 0};
        int case2[] = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};

        int result[] = getNumbers(case2);
        

        for (int i : result) {
            System.out.print(i+",");
        }
    }
}