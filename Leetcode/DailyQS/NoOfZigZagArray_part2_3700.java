package Leetcode.DailyQS;

public class NoOfZigZagArray_part2_3700 {


    static final long MOD = 1_000_000_007L;

    private long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;

        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {

                if (A[i][k] == 0)
                    continue;

                for (int j = 0; j < n; j++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }

        return C;
    }

    private long[][] power(long[][] base, long exp) {

        int n = base.length;

        long[][] result = new long[n][n];

        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        while (exp > 0) {

            if ((exp & 1) == 1) {
                result = multiply(result, base);
            }

            base = multiply(base, base);

            exp >>= 1;
        }

        return result;
    }

    private long[] multiplyMatrixVector(long[][] mat, long[] vec) {

        int n = mat.length;

        long[] res = new long[n];

        for (int i = 0; i < n; i++) {

            long sum = 0;

            for (int j = 0; j < n; j++) {
                sum = (sum + mat[i][j] * vec[j]) % MOD;
            }

            res[i] = sum;
        }

        return res;
    }

    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;

        int states = 2 * m;

        long[][] T = new long[states][states];

        for (int x = 0; x < m; x++) {

            for (int y = x + 1; y < m; y++) {

                T[y][m + x] = 1;
            }

            for (int y = 0; y < x; y++) {

                T[m + y][x] = 1;
            }
        }

        long[] start = new long[states];

        for (int i = 0; i < states; i++) {
            start[i] = 1;
        }

        long[][] P = power(T, n - 1);

        long[] finalState = multiplyMatrixVector(P, start);

        long ans = 0;

        for (long val : finalState) {
            ans = (ans + val) % MOD;
        }

        return (int) ans;
    }
}