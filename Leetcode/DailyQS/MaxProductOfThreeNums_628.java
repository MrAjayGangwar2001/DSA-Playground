import java.lang.reflect.Method;
import java.util.Arrays;

public class MaxProductOfThreeNums_628 {

    public static void main(String[] args) {

        int[] arr = {-1, -2, -3};
        // int[] arr = { -100, -98, -1, 2, 3, 4 };
        // int[] arr = { -1, -2, -3, -4 };
        int result1 = MethodBruteForce(arr);
        int result2 = Method2Loop(arr);
        int result3 = Method3NoLoop(arr);

        System.out.println("Result for Brute force Method : " + result1);
        System.out.println("Result for Single Loop Method : " + result2);
        System.out.println("Result for No Loop Method : " + result3);

    }

     private static int MethodBruteForce(int[] arr) {

        // Worst case Solution code Brute force Method with O(n3) Complexity

        int len = arr.length;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int n = arr[i] * arr[j] * arr[k];

                    max = Math.max(max, n);
                }

            }
        }

        return max;
    }

    private static int Method2Loop(int[] arr) {

        int len = arr.length;

        // Optimised Solution Code with O(n) Complexity

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : arr) {

            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        int max = Math.max(max1 * max2 * max3, min1 * min2 * max1);

        return max;

    }

   

    private static int Method3NoLoop(int[] arr) {

        // Optimised Solution in O(n log n) complexity

        int len = arr.length;

        Arrays.sort(arr);

        int max1 = arr[len - 1] * arr[len - 2] * arr[len - 3];
        int max2 = arr[0] * arr[1] * arr[len - 1];

        int max = Math.max(max1, max2);

        return max;
    }
}
