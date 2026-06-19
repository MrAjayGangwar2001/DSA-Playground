package Leetcode.DailyQS;

public class AngleBtwnHandsOfAClock_1344 {

    static double AngleClock(int hour, int minutes){

        double minAngle = minutes * 6.0;
        double hourAngle = (hour % 12) * 30.0 + minutes * 0.5;

        double angle = Math.abs(hourAngle - minAngle);

        return Math.min(angle, 360.0 - angle);


        // double minAngle = minutes * 6.0;
        // double hourAngle = (hour % 12) * 30.0 + minutes * 0.5;

        // double angle = Math.abs(hourAngle - minAngle);

        // return Math.min(angle, 360.0 - angle);


        

    }

    public static void main(String[] args){

        // int hours = 12;
        // int minutes = 30;
        
        // int hours = 3;
        // int minutes = 30;

        // int hours = 3;
        // int minutes = 15;

        int hours = 12;
        int minutes = 00;

        double Result = AngleClock(hours, minutes);

        System.out.print("Result : "+ Result);
    }

}
