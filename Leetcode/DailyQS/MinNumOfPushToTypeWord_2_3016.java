package Leetcode.DailyQS;

import java.util.Arrays;
import java.util.Map;

public class MinNumOfPushToTypeWord_2_3016 {

    public static int FindMinNumToPush(String word){

        int len = word.length();

        if (len <= 8) {
            return len;
            // System.out.println(len);
        }
        int[] arr = new int[26];

        // Map<Character, Integer> mp = new HashMap<>();

        for(char ch : word.toCharArray()){
            // mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            arr[ch - 'a']++;
        }


        // int idx = 0;
        // for(int num : mp.values()){
        //     arr[idx++] = num;
        // }

        Arrays.sort(arr);

        int total = 0;
        int index = 0;
        for (int i = 26 - 1; i >= 0; i--) {
            
            if (index <= 7) {
                
                total += arr[i];
            }else if(index >= 8 && index <= 15){
                total += 2 * arr[i];
            }else if(index >= 16 && index <= 23){
                total += 3 * arr[i];
            }

            if(index >=  24){
                int temp = index / 8;

                // total += (8 * temp) + (rem * (temp + 1));

                total += arr[i] * (temp + 1);
            }


            index++;
        }

        return total;
    }

    public static void main(String[] args) {
        
        String word = "aabbccddeeffgghhiiiiii";

        int result = FindMinNumToPush(word);

        System.out.println(result);
    }
}
