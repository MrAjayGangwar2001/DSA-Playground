package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class ScoreOfString_3110 {

    static int ScoreString(String s){

        int score = 0;

//         Method 1 Optimized Approach

        for(int i = 0; i < s.length() - 1; i++){

            int x = s.charAt(i);
            int y = s.charAt(i + 1);

            int result = Math.abs(x - y);

            score += result;
        }

        // Method 2 Unoptimized Approach or Basic Approach

//        List<Character> ls = new ArrayList<>();
        
//        for(char ch : s.toCharArray()){
//            ls.add(ch);
//        }
//
//        for (int i = 0; i < ls.size(); i++) {
//            for (int j = i +1; j < i + 2; j++) {
//
//                if (j == ls.size()) {
//                    return score;
//                }
//                int ans;
//                int x = ls.get(i);
//                int y = ls.get(j);
//
//                if (x >= y){
//                    ans = x - y;
//                }else{
//                    ans = y - x;
//                }
//                score += ans;
//            }
//        }
        return score;
    }

    static void main() {
        int Ans = ScoreString("hello");
        System.out.println(Ans);
    }
}
