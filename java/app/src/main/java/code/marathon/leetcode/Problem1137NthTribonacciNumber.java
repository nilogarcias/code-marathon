package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/n-th-tribonacci-number/">1137. N-th Tribonacci Number</a>
 */
public class Problem1137NthTribonacciNumber {
    private static final int[] trib = new int[38];

    static {
        trib[1] = 1;
        trib[2] = 1;
    }

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (trib[n] != 0) {
            return trib[n];
        }

        int tribN1 = tribonacci(n - 3);
        int tribN2 = tribonacci(n - 2);
        int tribN3 = tribonacci(n - 1);

        trib[n] = tribN1 + tribN2 + tribN3;

        return trib[n];
    }
}
