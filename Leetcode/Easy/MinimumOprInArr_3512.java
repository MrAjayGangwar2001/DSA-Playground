public class MinimumOprInArr_3512 {

    static int MinOperation(int arr[], int k){

        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        int operation = sum % k;

        return operation;
    }
    public static void main(String[] args) {
        
        int arr[] = {3, 7, 9};
        int k = 5;

        int opr = MinOperation(arr, k);

        System.out.println(opr);
    }
}
