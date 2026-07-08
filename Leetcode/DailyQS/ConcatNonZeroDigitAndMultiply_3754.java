package Leetcode.DailyQS;

public class ConcatNonZeroDigitAndMultiply_3754 {

    public static void main(String[] args) {

        int n = 10203004;
        // int n = 1000;

        long result = SumAndMultiply(n);

        System.out.println(result);
    }

    private static long SumAndMultiply(int n) {
       // long sum = 0;

        // String num = String.valueOf(n);

        // StringBuilder sb = new StringBuilder();

        // for (char ch : num.toCharArray()) {
        //     // String str = String.valueOf(ch);

        //     if (ch != '0') {
        //         sb.append(ch);
        //         // sum += Long.parseLong(String.valueOf(ch));
        //         sum += ch - '0';
        //     }

        // }

        // String s = sb.toString();

        // if(s.isEmpty()){
        //     return 0;
        // }

        // long digit = Long.parseLong(s);
        // return digit * sum;


        long sum = 0;
        long newNum = 0;
        while (n > 0) {
            int temp = n % 10;

            if(temp != 0){

                newNum = newNum * 10 + temp;
            }
            sum += temp;
            n /= 10;

        }
        
        long rev = 0;
        while (newNum > 0) {
                long temp = newNum % 10;
                newNum /= 10;
            rev = rev * 10 + temp;

        }

        long ans = rev * sum;

        return ans;
    }
}
