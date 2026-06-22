package Leetcode.DailyQS;

import java.util.HashMap;
import java.util.Map;

public class MaxNoOfBaloons_1189 {

    public static void main(String[] args) {

        // String str = "nlaebolko";
        // String str = "leetcode";
        String str = "loonbalxballpoon";

        // int Result = MaxBaloons(str);
        int Result = MaxOptimize(str);

        System.out.println("Result : " + Result);
    }

    private static int MaxBaloons(String str) {

        Map<Character, Integer> ls = new HashMap<>();

        for (char ch : str.toCharArray()) {
            ls.put(ch, ls.getOrDefault(ch, 0) + 1);
        }

        char[] arr = { 'b', 'a', 'l', 'l', 'o', 'o', 'n' };
        boolean times = true;

        int count = 0;
        while (times) {

            for (char ch : arr) {

                if (!ls.containsKey(ch) || ls.get(ch) == 0) {

                    return count;

                }

                ls.put(ch, ls.get(ch) - 1);

            }

            count++;
        }
        return count;

    }

    private static int MaxOptimize(String str) {

        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        int Result = Math.min(
                Math.min(freq['b' - 'a'], freq['a' - 'a']),
                Math.min(Math.min(freq['l' - 'a'] / 2, freq['o' - 'a'] / 2), freq['n' - 'a'])

        );

        return Result;

    }

}
