
import java.util.ArrayList;
import java.util.List;

public class PartitionArrayGivenPivot_2161{

    static int[] PartitionArray(int[] nums, int pivot){

        int len = nums.length;
        int[] arr = new int[len];

        int idx = 0;

        List<Integer> ls = new ArrayList<>();
        
        for(int num : nums){
            ls.add(num);
        }

        for (int i = 0; i < len; i++) {
            if(ls.get(i) < pivot){
                arr[idx++] = ls.get(i);
            }
        }

        for (int k = 0; k < len; k++) {
            if(ls.get(k) == pivot){
                arr[idx++] = ls.get(k);
            }
        }

        for (int j = 0; j < len; j++) {
            if(ls.get(j) > pivot){
                arr[idx++] = ls.get(j);
            }
        }
        


        return arr;
        
    }
    
    public static void main(String[] args) {
        
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        int[] result = PartitionArray(nums, pivot);

        for (int i : result) {
            System.out.print(i+",");
        }


        
        
    }
}