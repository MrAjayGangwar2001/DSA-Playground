package Leetcode.DailyQS;

public class GCDOfOddAndEvenSums_3658 {

    public static void main(String[] args) {
        
        int n = 4;

        int result = GCDOfOddEven(n);

        System.out.println(result);
        System.out.println(GCDOfOddEvenMethod2(n));
        System.out.println(GCDOfOddEvenMethod3(n));
    }

    private static int GCDOfOddEvenMethod3(int n) {

        int sumEv = 2;
        int sumOdd = 1;

        int even = 1;
        int odd = 1;


        // int i = 3;
        // while (even != n && odd != n) {
        //     if (i % 2 == 0) {
        //         sumEv += i;
        //         even++;
        //     } else {
        //         sumOdd += i;
        //         odd++;
        //     }

        //     i++;
        // }

        for(int i = 3; i < 2 * n; i++){
            if(i % 2 == 0){
                sumEv += i;
            }else{
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
    private static int GCDOfOddEvenMethod2(int n) {
        // we Already know....
        // sum of odd N Natural Numbers = n^2
        // sum of Even N Natural Numbers = n(n + 1)

        int SumEven = n * (n + 1);
        int SumOdd = n * n;

        // if we find GCD(n * n, n * (n + 1)) = n^2, n^2 + n
        // so here the remaining is n which is 4 in our case because n^2 is common in both

        return n;
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



        