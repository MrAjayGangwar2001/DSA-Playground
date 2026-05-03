
public class MinNumberOprOfBall_1769 {

    static int[] MinOperation(String boxes) {

        int len = boxes.length();
        int arr[] = new int[len];

        // Brute force Method took 129 ms Runtime

        for (int i = 0; i < len; i++) {

            int count = 0;
            for (int j = 0; j < len; j++) {

                if (boxes.charAt(j) == '1') {
                    count += Math.abs(i - j);
                }
            }

            arr[i] = count;
        }

        return arr;
    }

    public static void main(String[] args) {
        String boxes = "110";
        String boxes1 = "001011";

        int result[] = MinOperation(boxes1);

        for (int array : result) {
            System.out.print(array + ", ");
        }
    }
}
