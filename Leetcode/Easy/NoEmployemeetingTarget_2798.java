package Leetcode.Easy;



public class NoEmployemeetingTarget_2798{

    static int NoOfEmployeWhoMetTarget(int[] hours, int target){

        int count = 0; 

        for(int arr : hours){
            if(arr >= target){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int [] hours = {0,1,2,3,4};
        int target = 2;

        int [] hours2 = {5,1,4,2,2};
        int target2= 6;

        int result = NoOfEmployeWhoMetTarget(hours, target);
        int result2 = NoOfEmployeWhoMetTarget(hours2, target2);

        System.out.println(result);
        System.out.println(result2);
    }
}