package Leetcode.DailyQS;

import java.util.HashMap;
import java.util.Map;

public class MaxNoOfBaloons_1189 {

    public static void main(String[] args) {

        // String str = "nlaebolko";
        // String str = "leetcode";
        String str = "loonbalxballpoon";

        int Result = MaxBaloons(str);
        

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

    

}
