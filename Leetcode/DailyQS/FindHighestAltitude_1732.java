package Leetcode.DailyQS;

public class FindHighestAltitude_1732 {

    public static int FindHighest(int[] gain) {

        int MaxGain = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {

            sum += gain[i];

            MaxGain = Math.max(MaxGain, sum);
        }

        // if (MaxGain >= 0) {
        // System.out.println("Result : "+MaxGain);
        // } else {
        // System.out.println("Result : "+ 0);
        // }

        if (MaxGain > 0) {
            return MaxGain;
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] gain = { -5, 1, 5, 0, -7 };
        

        int Result = FindHighest(gain);

        System.out.println("Result : " + Result);

    }
}
