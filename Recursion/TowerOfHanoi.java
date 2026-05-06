public class TowerOfHanoi {
    public static void towerofhanoi(int n, String src, String help, String dest){
        if (n == 1) {
            
            System.out.println("Transfer disk " +n+ " from " +src+ " to " + dest);
            return;
        }

        // A = source(src)
        // B = helper(help)
        // C = Destination(dest)
        towerofhanoi(n-1, src, dest, help);
        System.out.println("Transfer disk " +n+ " from " +src+ " to " + dest);
        towerofhanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n = 5;

        // Time Complexity of Tower of Hanoi
        // Big O(2n-1) == Big O(2n)
        towerofhanoi(n, "Source", "Helper", "Destination");
    }
}
