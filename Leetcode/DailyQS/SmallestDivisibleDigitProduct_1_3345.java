package Leetcode.DailyQS;

public class SmallestDivisibleDigitProduct_1_3345 {

    public static int SmallestDivisibleDigitProduct(int n, int t){

          for (int i = n; i <= 100; i++) {
            
            int num = i;
            if (i < 10) {
                if(i % t == 0){
                    return i;
                }else{
                    continue;
                }
            } else {
                int digit1 = i % 10;

                int x = i / 10;

                int digit2 = x % 10;

                if((digit1 * digit2) % t == 0){
                    return num;
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int n = 15;
        int t = 3;
        // int n = 10;
        // int t = 2;

        int ans = SmallestDivisibleDigitProduct(n, t);

        System.out.println(ans);
    }
}
