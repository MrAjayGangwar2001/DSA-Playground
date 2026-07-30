package Leetcode.DailyQS;

public class MinNumPushTypeWord_1_3014 {

    private static int MinimumNumberPushKeyword(String word){

        int len = word.length();

        if(len <= 8){
            return len;
        }

        if (len > 8 && len <= 16) {
            
            int remainingChar = len - 8;

            return 8 + (remainingChar * 2);
        } else if(len > 16 && len <= 24){
            
            int remainingChar = len - 16;

            return 24 + (remainingChar * 3);

        }else if(len == 25){
            return 24 + 4 + 24;
        }else{
            return 24 + 8 + 24;
        }

        
    }

    public static void main(String[] args) {
        
        // String word = "abcde";
        String word = "xycdefghij";

        int result = MinimumNumberPushKeyword(word);

        System.out.println("Result: "+ result);
    }
}
