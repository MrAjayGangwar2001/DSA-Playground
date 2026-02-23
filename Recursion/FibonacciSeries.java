public class FibonacciSeries {

    public static void series(int x, int y, int n){
        if (n == 0) {
            return;
        }
        int z = x + y;
        System.out.println(z);
        series(y, z, n-1);
    }
    public static void main(String[] args) {
        int x = 0; int y = 1;
        int n = 7;
        System.out.println(x);
        System.out.println(y);
        series(x, y, n-2);
    }
}
