package Leetcode.DailyQS;

public class EarliestFinishTimeForLandAndWater_3633 {

    public static void main(String[] args) {

        int[] landStartTime = { 2, 8 };
        int[] landDuration = { 4, 1 };
        int[] waterStartTime = { 6 };
        int[] waterDuration = { 3 };

        /*
        int[] landStartTime = { 5};
        int[] landDuration = { 3 };
        int[] waterStartTime = { 1 };
        int[] waterDuration = { 10};

        int time1 = Integer.MAX_VALUE;

        int wLan = waterStartTime.length;
        int idx = 0;

        for (int i = 0; i < landStartTime.length; i++) {
            int total = 0;

            total += landStartTime[i] + landDuration[i];

            while (wLan > idx) {

                if (total > waterStartTime[idx]) {

                    total += waterDuration[idx];

                } else {
                    
                    total += waterStartTime[idx] + waterDuration[idx];
                }

                idx++;
            }

            time1 = Math.min(time1, total);
        }

        int Llan = landStartTime.length;
        int idxx = 0;
        int time2 = Integer.MAX_VALUE;
        for (int j = 0; j < waterStartTime.length; j++) {
            int total = 0;

            total += waterStartTime[j] + waterDuration[j];

            while (Llan > idxx) {

                if(total > landStartTime[idxx]){
                    total += landDuration[idxx];
                }else{

                    total += landStartTime[idxx] + landDuration[idxx];
                }

                idxx++;
            }

            time2 = Math.min(time2, total);
        }

         */
// 2, 8 -- 4, 1 -- 6, 3
        int minTime = Integer.MAX_VALUE;

        for(int i = 0; i < landStartTime.length; i++){

            int total = landStartTime[i] + landDuration[i];

            for(int j = 0; j < waterStartTime.length; j++){

                int totalTime1 = Math.max(total, waterStartTime[j]) + waterDuration[j];

                minTime = Math.min(minTime, totalTime1);


                int waterTime = waterStartTime[j] + waterDuration[j];

                int totalTime2 = Math.max(waterTime, landStartTime[j]) + landDuration[j];
                

                minTime = Math.min(minTime, totalTime2);
            }
        }

        

        System.out.println(minTime);
    }

}

