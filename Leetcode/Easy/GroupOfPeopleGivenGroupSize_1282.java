package Leetcode.Easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfPeopleGivenGroupSize_1282 {


    static List<List<Integer>> GroupPeoples(int[] groupSize){

        List<List<Integer>> ls = new ArrayList<>();

        Map<Integer, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < groupSize.length; i++) {
            

            int size = groupSize[i];

            mp.putIfAbsent(size, new ArrayList<>());

            mp.get(size).add(i);

                
                if(mp.get(size).size() == size){
                   
                    ls.add(new ArrayList<>(mp.get(size)));

                    mp.get(size).clear();
                    
                }
             
        }


        System.out.println(ls);

        return ls;

    }

    public static void main(String[] args) {
        
        int [] arr = {3,3,3,3,3,1,3};
        int [] arr1 = {2,1,3,3,3,2};

        GroupPeoples(arr);
        GroupPeoples(arr1);

        
    }
}
