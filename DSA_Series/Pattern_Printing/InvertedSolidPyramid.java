
// * * * * * * * 
//   * * * * *
//     * * * 
//       *

public class InvertedSolidPyramid {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 0; row < n; row++) {
            int space = 0;
            for (; space < row; space++) {
                System.out.print("  ");
            }
            for (int col = 0; col < (2 * n - row - space) - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
