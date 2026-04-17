

//         1 
//       1 2 1 
//     1 2 3 2 1 
//     2 3 4 3 2 1 


public class NumberPyramid {
    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");

            }

            int rev = row - 1;
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(rev+" ");
                rev--;
            }
            System.out.println();
        }
    }
}
