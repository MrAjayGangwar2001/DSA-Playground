public class ArrayConcat_1929 {

    static public int[] getConcatenation(int[] nums) {

        // Method 1 Using List

        List<Integer> ls = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toList());

        for(int arr : nums){
        ls.add(arr);
        }

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