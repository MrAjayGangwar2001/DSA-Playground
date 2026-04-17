
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

public class SolidRombos {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < 5; row++) {
            for (int space = 0; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 5; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
