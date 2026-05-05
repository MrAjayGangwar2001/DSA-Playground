import java.util.Scanner;

public class Printnumbers {

    public static void printdec(int n){
        if (n==0) {
            //System.out.println("Number is too small");
            return;
        }
        System.out.println("Number : " +n);

        printdec(n-1);
    }

    public static void printInc(int n1){
        if (n1==6) {
            return;
        }

        System.out.println(n1);
        printInc(n1+1);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n =10;
        int n1 = 0;
        printdec(n);
        printInc(n1);
    }
}