package Leetcode.Easy;

public class Moves_Zero_283 {
    public static void main(String[] args) {

        int arr[] = { 1, 0, 3, 6, 9, 0, 8, 7 };

        for (int i = 0; i < arr.length;) {

            if (arr[i] == 0) {

                for (int j = i; j < (arr.length) - 1; j++) {

                    arr[j] = arr[j + 1];
                    // arr[i + 1] = (arr.length) - 1;
                    // System.out.println(arr[i]);

                }
            }
            arr[arr.length - 1] = 0;
            i++;
        }
        for (int nums : arr) {
            System.out.print(nums + ", ");
        }

    }
}
