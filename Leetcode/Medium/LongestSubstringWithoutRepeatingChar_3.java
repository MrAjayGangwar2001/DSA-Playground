package Leetcode.Medium;

// WINDOW SIZE ==> right - left + 1
//  1. Move Forward
//  2. Process Window Data
//  3. Shrink/Expand window if Required
//  window ===>  [ left..........right ]

class LongestSubstringWithoutRepeatingChar_3 {
    public static int lengthOfLongestSubstring(String s) {

    // METHOD 1 USING HASHMAP OPTIMISED BUT TOOK 6MS RUNTIME------------------

        // Map<Character, Integer> mp = new HashMap<>();

        // int length = 0;
        // int left = 0;

        // for (int right = 0; right < s.length(); right++) {

        //     char ch = s.charAt(right);

        //     if (mp.containsKey(ch) && mp.get(ch) >= left) {
        //         left = mp.get(ch) + 1;
        //     }
        //     mp.put(ch, right);

        //     length = Math.max(length, right - left + 1);
        //     // System.out.println("map.get method " +mp.get(ch));
        // }

    // METHOD 2 MORE OPTIMIZED AND EFFICIENT TOOK 1 ms RUNTIME

        int left = 0;
        int length = 0;
        int[] arr = new int[128];

        for (int right = 0; right < s.length(); right++) {
            
            char ch = s.charAt(right);
            System.out.println("character "+ ch);

            left = Math.max(left, arr[ch]);
            System.out.println("left - Max "+ left);
            
            length = Math.max(length, right - left + 1);
            System.out.println("length - Max "+ length);
            
            arr[ch] = right + 1;
            System.out.println("arr[ch] "+ arr[ch]);
        }

        return length;

    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb");
        // int result = lengthOfLongestSubstring("bbbbbb");
        // int result = lengthOfLongestSubstring("bbaacc");
        System.out.println(result);
    }
}
