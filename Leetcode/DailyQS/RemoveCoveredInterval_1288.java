package Leetcode.DailyQS;

public class RemoveCoveredInterval_1288 {

    public static int RemainingIntervals(int[][] intervals){

        int len  = intervals.length;

        int remaining = 0;

        for (int i = 0; i < len; i++) {
            
            boolean covered = false;
            for (int j = 0; j < len; j++) {
                
                if(i == j){
                    continue;
                }

                if(intervals[j][0] <= intervals[i][0] && intervals[j][1] >= intervals[i][1]){

                    covered = true;
                    break;
                }


            }

            if (!covered) {
                remaining++;
            }
        }

        return remaining;
    }

    public static void main(String[] args) {

        // int[][] intervals = {    
        //     {1, 4},
        //     {3, 6},
        //     {2, 8}
        // };                  // 2
        int[][] intervals = {
            {1, 4},
            {2, 3}
        };            // 1
        
        int result = RemainingIntervals(intervals);

        System.out.println("Result : "+result);
    }
}
