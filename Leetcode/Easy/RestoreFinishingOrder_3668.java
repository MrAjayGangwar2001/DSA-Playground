import java.util.HashSet;
import java.util.Set;

public class RestoreFinishingOrder_3668 {

    static int[] RecoverOrder(int[] order, int[] friends) {

        Set<Integer> ls = new HashSet<>();


        for (int num : friends) {
            ls.add(num);
        }
        int len = ls.size();

        int arr[] = new int[len];

        int idx = 0;
        for (int n : order) {
            if (ls.contains(n)) {
                arr[idx] = n;
                idx++;
            }

            ls.add(n);
        }

        return arr;
    }

    public static void main(String[] args) {

        int order[] = { 1, 4, 5, 3, 2 };
        int friends[] = { 2, 5 };
        int[] result = RecoverOrder(order, friends);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}