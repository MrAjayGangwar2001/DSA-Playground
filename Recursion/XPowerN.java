public class XPowerN {

    public static int CalcPower(int x, int n){
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int powrNm1 = CalcPower(x, n-1);
        int powr = x * powrNm1;
        return powr; 
    }
    public static void main(String[] args) {
        
        int x = 3; int n = 4;
        int result = CalcPower(x, n);
        System.out.println("Power of x : " +result);
    }
}
