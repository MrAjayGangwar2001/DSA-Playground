

public class MinNumberOprOfBall_1769 {

    static int[] MinOperation(String boxes) {

        int len = boxes.length();
        int arr[] = new int[len];

// Brute force Method took 129 ms Runtime

    //    for (int i = 0; i < len; i++) {

    //        int count = 0;
    //        for (int j = 0; j < len; j++) {

    //            if (boxes.charAt(j) == '1') {
    //                count += Math.abs(i -j);
    //            }
    //        }

    //        arr[i] = count;
    //    }

        // OPTIMIZED BUT TOOK 3ms RUNTIME
    // From left to Right check
/*
    int count = 0;
    int cost = 0;
    for (int i = 0; i < len; i++) {
            arr[i] += cost;
        if (boxes.charAt(i) == '1') {
            count++;
        }
        cost += count;
    }

    // From Right to left

        cost = 0;
        count = 0;

        for (int j = len - 1; j >= 0; j--) {
            arr[j] += cost;

            if (boxes.charAt(j) == '1') {
                count++;

            }
            cost += count;
        }
*/

    // Most Optimized Solution and It Runs in 2 ms

    char res[] = boxes.toCharArray();

        int count = 0;
        int cost = 0;
        for (int i = 0; i < len; i++) {
            arr[i] += cost;

            if(res[i] == '1'){
                count++;
            }
            cost += count;
        }

        cost = 0;
        count = 0;
        for (int j = len - 1; j >= 0; j--) {
            arr[j] += cost;

            if(res[j] == '1'){
                count++;
            }
            cost += count;
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
