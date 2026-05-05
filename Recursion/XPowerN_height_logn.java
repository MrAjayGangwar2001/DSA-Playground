public class XPowerN_height_logn {
    public static int CalcPowerWithLognHeight(int x, int n){
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {          // if N is Even
            return CalcPowerWithLognHeight(x, n/2) * CalcPowerWithLognHeight(x, n/2);
        } else {                   // if N is odd
            return CalcPowerWithLognHeight(x, n/2) * CalcPowerWithLognHeight(x, n/2) * x;
        }

    }
    public static void main(String args[]){
        int x = 2;
        int n = 6;
        int result = CalcPowerWithLognHeight(x, n);
        System.out.println("Result with Stack height logn : " +result);
    }
}
