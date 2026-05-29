package Leetcode.Medium;

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingChar_3 {
    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> mp = new HashMap<>();

    /

        int length = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (mp.containsKey(ch) && mp.get(ch) >= left) {
                left = mp.get(ch) + 1;
            }
            mp.put(ch, right);

            length = Math.max(length, right - left + 1);
            
        }

        return length;

    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb");
        
        System.out.println(result);
    }
}

