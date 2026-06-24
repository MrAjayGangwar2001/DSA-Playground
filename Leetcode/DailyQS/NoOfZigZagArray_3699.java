package Leetcode.DailyQS;

public class NoOfZigZagArray_3699 {
    public static void main(String[] args) {

        int n = 3;
        int l = 4;
        int r = 5;

        int Result = ZigZagArray(n, l, r);

        System.out.println("Result : " + Result);
    }

    private static final int MOD = 1_000_000_007;

    private static int ZigZagArray(int n, int l, int r) {

        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        for (int i = 0; i < m; i++) {
            up[i] = 1;
            down[i] = 1;
        }

        for (int len = 2; len <= n; len++) {

            long[] prefixUp = new long[m + 1];
            long[] prefixDown = new long[m + 1];

            for (int i = 0; i < m; i++) {
                prefixUp[i + 1] = (prefixUp[i] + up[i]) % MOD;
                prefixDown[i + 1] = (prefixDown[i] + down[i]) % MOD;
            }

            long[] nextUp = new long[m];
            long[] nextDown = new long[m];

            for (int v = 0; v < m; v++) {

    // previous value < current value
                nextDown[v] = prefixUp[v] % MOD;

    // previous value > current value
                nextUp[v] = (prefixDown[m] - prefixDown[v + 1] + MOD) % MOD;
            }

            up = nextUp;
            down = nextDown;
        }

        long ans = 0;

        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }

}
