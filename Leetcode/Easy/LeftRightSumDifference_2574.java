
public class LeftRightSumDifference_2574 {

    static int[] SumDifference(int[] nums) {

        int len = nums.length;

        int[] left = new int[len];
        int[] right = new int[len];

        int[] arr = new int[len];

        if (len == 1) {
            arr[0] = 0;
            return arr;
        }

        arr[0] = 0;
        for (int i = 0; i < len; i++) {

            int sum = 0;

            for (int j = i + 1; j < len; j++) {
                sum += nums[j];
            }

            right[i] = sum;
        }

        for (int i = len - 1; i >= 0; i--) {

            int sum = 0;

            for (int j = i - 1; j >= 0; j--) {
                sum += nums[j];
            }

            left[i] = sum;
        }

        for (int k = 0; k < len; k++) {
            int total = Math.abs(left[k] - right[k]);

            arr[k] = total;
        }

    

        return arr;
    }

    public static void main(String[] args) {
        int[] testCase = { 10, 4, 8, 3 };
        int[] testCase2 = { 1 };

        int[] result = SumDifference(testCase);

        for (int i : result) {
            System.out.print(i + ", ");
        }
    }
}
