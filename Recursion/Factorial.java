public class Factorial {

    public static int fact(int n){
        if (n==1 || n==0) {
            return 1;
        }
        int temp = fact(n-1);
        int fact = n * temp;
        return fact;
    }
    public static void main(String[] args) {
        
        int n = 7;
        int result = fact(n);
        System.out.println("Factorial : " +result);
    }
}
