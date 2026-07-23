import java.util.HashSet;
import java.util.Set;

public class NumOfUniqueXORTriplet_1_3513 {

    public static void main(String[] args) {
        // int[] nums = {3, 1, 2};
        int[] nums = {3, 1, 2, 4, 5, 6, 120};
       int result = UniqueXORTriplets(nums);

       System.out.println(result);
    }

    private static int UniqueXORTriplets(int[] nums) {
        
        int len = nums.length;

        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < len; i++) {
            
            for (int j = i; j < len; j++) {
                
                for (int k = j; k < len; k++) {
                    
                    int ans = nums[i] ^ nums[j] ^ nums[k];

                    st.add(ans);
                }
            }
        }

        System.out.println(st);

        return st.size();

    
    }
}
