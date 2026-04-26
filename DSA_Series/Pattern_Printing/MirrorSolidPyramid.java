


//      * * * * * * * 
//        * * * * * 
//         * * * 
//           * 
//         * * * 
//        * * * * * 
//      * * * * * * *

public class MirrorSolidPyramid {
    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= (n * 2) - (2 * row - 1); col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row = 1; row < n; row++) {
            for (int space = 1; space <= (n - row) - 1; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= (2 * row) + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
