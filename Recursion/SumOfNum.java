public class SumOfNum {

    public static void sum(int i, int n, int sum){
        if (i == n) {
            sum += i;
            System.out.println("Sum of All Numbers : " +sum);
            return;
        }
        sum += i;
        sum(i+1, n, sum);
    }
    public static void main(String[] args) {
        sum(1, 15, 0);
    }
}
