import java.lang.reflect.Method;
import java.util.Arrays;

public class MaxProductOfThreeNums_628 {

    public static void main(String[] args) {

        int[] arr = {-1, -2, -3};
        // int[] arr = { -100, -98, -1, 2, 3, 4 };
        // int[] arr = { -1, -2, -3, -4 };
        int result1 = MethodBruteForce(arr);
       

        System.out.println("Result for Brute force Method : " + result1);
        
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

    
}
