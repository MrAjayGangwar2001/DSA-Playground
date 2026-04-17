

//          1 
//        2 2 2 
//      3 3 3 3 3 
//    4 4 4 4 4 4 4 


public class NumberPyramid_2 {
    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }
    }
}
