package Leetcode.Easy;

import java.util.Arrays;


public class MinNoOfMoveToSeatEveryone_2037 {

    public static void main(String[] args) {
        
        int[] seats = {12, 14, 19, 19, 12};
        int[] students = {19, 2, 17, 20, 7};    // Ans : 19
        

        int Result = MinMovesForSeat(seats, students);

        System.out.println("Result : "+Result);
    }

    private static int MinMovesForSeat(int[] seats, int[] students) {
        
        Arrays.sort(seats);
        Arrays.sort(students);

        int difference = 0;

        for (int i = 0; i < seats.length; i++) {
            
            difference += Math.abs(seats[i] - students[i]);
        }

        return difference;
    }

}
