

public class ArrayConcat_1929 {

    static public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int arr[] = new int[2 * len];

        // Method 1 Using List

        // List<Integer> ls = Arrays.stream(nums)
        // .boxed()
        // .collect(Collectors.toList());

        // for(int ar : nums){
        // ls.add(ar);
        // }

        
        // Method 2 Using for lopp and Stream API

        // for(int i =0; i<len; i++){
        // arr[i] = nums[i];
        // arr[i + len] = nums[i];
        // }

        // return ls.stream().mapToInt(x -> x).toArray();

        // Method 3 Using Nested for loop but it is worst case and Exceed time limit

        // int len = nums.length;
        // int arr[] = new int[len];

        
        int i = 0;
        for (int k = 1; k <= 2; k++) {
            // while (i < arr.length) {
                for (int j = 0; j < nums.length; j++) {
                    arr[i] = nums[j];
                    i++;
                }

            // }
        }

        // Method 4 Optimized and Efficient
        // System.arraycopy(nums, 0, arr, 0, len);
        // System.arraycopy(nums, 0, arr, len, len);



        return arr;

    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 1};
        // int nums[] = { 1, 3, 2, 1 };
        
        int result[] = getConcatenation(nums);
        for (int arr : result) {
            System.out.print(arr + ", ");
        }
    }
}