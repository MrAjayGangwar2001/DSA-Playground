package Leetcode.DailyQS;

public class SequentialDigits_1291 {

    public static void main(String[] args) {

        int low = 1000;
        int high = 13000;
        // int low = 100;
        // int high = 300;

        int[] ans = SequentialDigits(low, high);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    private static int[] SequentialDigits(int low, int high) {


        int L = (String.valueOf(low)).length();
        int H = (String.valueOf(high)).length();
        String max = "123456789";

        int[] result = new int[40];
        int idx = 0;

        while (L <= H) {
            for (int i = 0; i + L <= 9; i++) {
               
                String str = "";
                for (int j = i; j < i + L; j++) {

                    char c = max.charAt(j);

                    str = str + String.valueOf(c);

                }
               
                int num = Integer.parseInt(str);

                if (num >= low && num <= high) {
                    result[idx++] = num;
                }

            }
            L++;

        }

        return result;
    }
}
