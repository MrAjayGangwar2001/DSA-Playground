package Leetcode.DailyQS;

import java.util.HashMap;
import java.util.Map;

public class FindMaxNumOfEleSubset_3020 {

    public static void main(String[] args) {

        // int[] arr = {1, 1, 1, 1, 1, 4, 16, 2};
        int[] arr = { 5, 4, 1, 2, 2 };
        // int[] arr = { 2, 16, 4, 2, 4 };
        // int[] arr = {1, 3, 2, 4};
        // int[] arr = {5, 4, 1, 2, 2};

        int Result = MaxElementSubset(arr);

        System.out.println(Result);

    }

    private static int MaxElementSubset(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        if (mp.containsKey(1)) {
            int freq = mp.get(1);

            int len = 0;
            if (freq % 2 == 0) {
                len = freq - 1;
            } else {
                len = freq;
            }

            count = Math.max(count, len);
        }

        for (int n : mp.keySet()) {

            if (n == 1)
                continue;

            int curr = n;

            int len = 0;

            while (mp.containsKey(curr)) {

                int freq = mp.get(curr);

                if (freq == 1) {
                    len++;
                    break;
                }

                if (freq >= 2) {
                    int next = curr * curr;
                    if (mp.containsKey(next)) {

                        len += 2;
                        curr = next;
                    } else {

                        len += 1;
                        break;
                    }
                }
            }

            count = Math.max(count, len);
        }

        return count;
    }

}
