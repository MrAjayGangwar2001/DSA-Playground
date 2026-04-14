
//      |     *
//      |    * *
//      |   * * *
//      |  * * * *
//      | * * * * *

public class SolidPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < (n - row); space++) {
                System.out.print("  ");
            }

            // for (int col = 0; col < row ; col++) {        // for Sequence * Print
            //     System.out.print("* ");
            // }

            for (int col = 0; col < (2*row)-1 ; col++) {     // for odd Star print
                System.out.print("* ");
            } 

            System.out.println();
        }
    }
}
