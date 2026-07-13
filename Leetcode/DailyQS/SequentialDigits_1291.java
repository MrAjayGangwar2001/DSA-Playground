package Leetcode.DailyQS;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits_1291 {

    public static void main(String[] args) {

        int low = 1000;
        int high = 13000;
        // int low = 100;
        // int high = 300;

        List<Integer> ans = SequentialDigits(low, high);

        System.out.println(ans+" ");
    }

    private static List<Integer> SequentialDigits(int low, int high) {


        int L = (String.valueOf(low)).length();
        int H = (String.valueOf(high)).length();
        String max = "123456789";

        List<Integer> result = new ArrayList<>();

        while (L <= H) {
            for (int i = 0; i + L <= 9; i++) {
               
                String str = "";
                for (int j = i; j < i + L; j++) {

                    char c = max.charAt(j);

                    str = str + String.valueOf(c);

                }
               
                int num = Integer.parseInt(str);

                if (num >= low && num <= high) {
                    result.add(num);
                }

            }
            L++;

        }

        return result;
    }
}
