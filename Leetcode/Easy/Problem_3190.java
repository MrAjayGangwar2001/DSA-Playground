
// PROBLEM NO. 3190
//  find-minimum-operations-to-make-all-elements-divisible-by-three

public class Problem_3190 {

    public int minimumOperations(int[] nums) {

        int opr = 0;
        for (int num : nums) {
            int rem = num % 3;
            if (rem == 1) {
                opr++;
            } else if (rem == 2) {
                opr++;
            }
        }
        return opr;
    }

    public static void main(String[] args) {

    }
}
