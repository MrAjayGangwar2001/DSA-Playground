package Leetcode.DailyQS;

import java.util.ArrayList;
import java.util.List;

public class NoOfStringAppearAsSubstringInWord_1967 {

    public static void main(String[] args) {
        
        String word = "abc";

        String[] pattern = {"a","abc","bc","d"};

        int Result = NoOfSubString(pattern, word);

        System.out.println(Result);

    }

    private static int NoOfSubString(String[] pattern, String word) {
       
        int count = 0;

        for(String s : pattern){

            // boolean check = word.contains(s);

            // if (check) {
            if (word.contains(s)) {
                count++;
            }


            
        }
        
        return count;
    }
}
