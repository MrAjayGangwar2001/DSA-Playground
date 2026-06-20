package Leetcode.DailyQS;

public class MinTimeVisitingAllPoints_1266 {

    public static int MinTimeToVisit(int[][] points){

        int minTime = 0;
        int len = points.length;

        
        // for (int i = 1; i < len ; i++) {
            
        //     int dx = points[i - 1][0];
        //     int dy = points[i - 1][1];
        
        
        //     int time1 = Math.abs(dx -  points[i][0]);
        //     int time2 = Math.abs(dy - points[i][1]);
        
        
        
        //     minTime += Math.max(time1, time2);
        // }
    

//    MORE CLEANER AND READABLE
        for (int i = 1; i < len ; i++) {

            int x1 = points[i - 1][0];
            int y1 = points[i - 1][1];

            int x2 = points[i][0];
            int y2 = points[i][1];


            int dx = Math.abs(x1 -  x2);
            int dy = Math.abs(y1 - y2);
            

            
            minTime += Math.max(dx, dy);
        }

        return minTime;
    }

    public static void main(String[] args) {

        // int[][] points = {{1, 1}, {3, 4}, {-1, 0}};    // 7
        int[][] points = {{3, 2}, {-2, 2}};              // 5

        int result = MinTimeToVisit(points);

        System.out.println(result);
        
    }

}
