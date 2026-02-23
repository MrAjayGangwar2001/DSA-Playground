
public class Moves_Zero_283 {
    public static void main(String[] args) {

        // int arr[] = { 1, 0, 3, 6, 9, 0, 8, 7 };
        // int arr[] = { 0, 0, 1 };
        int arr[] = { 0, 1, 0, 3, 12 };

        // This forloop Methods is Working but Taking time longer than expected or
        // Exceed Maximum
        /*
         * for (int k = 0; k < arr.length; k++) {
         * 
         * for (int i = 0; i < arr.length;) {
         * 
         * if (arr[i] == 0) {
         * 
         * for (int j = i; j < (arr.length) - 1; j++) {
         * 
         * arr[j] = arr[j + 1];
         * // arr[i + 1] = (arr.length) - 1;
         * // System.out.println(arr[i]);
         * 
         * }
         * arr[arr.length - 1] = 0;
         * }
         * i++;
         * }
         * }
         */

        // Method 2:- Optimized Approach(Two Pointer)
        // ====> Time Complexity = O(N) : Space = O(1)
        int idx = 0;

        for (int num : arr) {
        if (num != 0) {
        arr[idx++] = num;
        }

        }

        while (idx < arr.length) {
        arr[idx++] = 0;
        }

        // Method 3 : Swapping....
        // Same Time & Space Complexity ==> O(n) & O(1)
        /*
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;

                idx++;
            }
        }
        */

        // Printing Final Output/Array
        for (int nums : arr) {
            System.out.print(nums + ", ");
        }

    }
}
