package Leetcode.Easy;


import java.util.ArrayList;
import java.util.List;



public class CountPairWhoseLessThanTarget_2824{

    static int CountPair(List<Integer> nums, int target){

        int len = nums.size();

        int pairs = 0;

        for(int i = 0; i < len; i++){

            for(int j = i+1; j < len; j++){

                if(nums.get(i) + nums.get(j) < target){
                    pairs++;
                }



            }
        }


        return pairs;
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(-1,1,2,3,1));
        int target = 2;
        
        int result = CountPair(nums, target);

        System.out.println(result);
    }
}