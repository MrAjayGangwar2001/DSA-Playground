package Leetcode.DailyQS;

public class GCDOfOddAndEvenSums_3658 {

    public static void main(String[] args) {
        
        int n = 4;

        int result = GCDOfOddEven(n);

        System.out.println(result);
        
    }

    
    private static int GCDOfOddEven(int n) {
        
        // int count = 1;

        int sumEv = 2;
        int sumOdd = 1;

        for(int i = 3; i < 2 * n; i++){
            if (i % 2 == 0) {
                sumEv += i;
            } else {
                sumOdd += i;
            }
        }

        while (sumOdd != 0) {
            
            int temp = sumOdd;
            sumOdd = sumEv % sumOdd;
            sumEv = temp;
        }

        return sumEv;
    }
}



        