package Leetcode.DailyQS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmallestSubsequenceOfDistinctChar_1081 {

    public static void main(String[] args) {

        String s = "cbacdcbc";

        String Result = SmallestSubSequence(s);

        System.out.println(Result);

    }

    private static String SmallestSubSequence(String s) {

        // Map<Character, Integer> lastIdx = new HashMap<>();

        int[] idx = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // lastIdx.put(ch, i);

            idx[ch - 'a'] = i;
        }

        // System.out.println(lastIdx);

        // Stack<Character> sk = new Stack<>();
        Deque<Character> sk = new ArrayDeque<>();

        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (visited[ch - 'a']) {
                continue;
            }

            // while (!sk.isEmpty() && (ch - 'a') < (sk.peek() - 'a') && lastIdx.get(sk.peek()) > i) {
            while (!sk.isEmpty() && (ch - 'a') < (sk.peek() - 'a') && idx[sk.peek() - 'a'] > i) {

                char c = sk.pop();
                visited[c - 'a'] = false;
            }

            // if (!visited[ch - 'a']) {

                sk.push(ch);
            // }
            visited[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!sk.isEmpty()) {
            sb.append(sk.pop());
        }

        return sb.reverse().toString();
    }
}
