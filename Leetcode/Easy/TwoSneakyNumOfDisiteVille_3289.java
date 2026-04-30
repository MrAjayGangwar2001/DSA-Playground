package Leetcode.Easy;

public class TwoSneakyNumOfDisiteVille_3289{

    static int[] getNumbers(int [] nums){

        int len = nums.length;

        int arr[] = new int[2];
        int idx = 0;

    // Method 1 Bruteforce Method----- Runtime 1 Ms good for Small input

        for (int i = 0; i < len; i++) {
            
            for (int j = i+1; j < len; j++) {
                
                if (nums[i] == nums[j]) {
                    arr[idx++] = nums[i];

                    if (idx == 2) break;
                }
            }
        }

 
        return arr;
    }

    public static void main(String[] args) {
        int case1[] = {0, 1, 1, 0};
        int case2[] = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};

        int result[] = getNumbers(case2);
        

        for (int i : result) {
            System.out.print(i+",");
        }
    }
}