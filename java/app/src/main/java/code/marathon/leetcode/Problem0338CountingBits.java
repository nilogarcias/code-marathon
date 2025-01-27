package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/counting-bits/description">338. Counting Bits</a>
 */
public class Problem0338CountingBits {

    // Complexity: O(n)
    // Space: O(n)
    private int[] countBitsWithoutRecursion(int n) {
        int[] ans = new int[n + 1];
        if (n == 0) {
            return ans;
        }

        ans[1] = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans[i] = ans[i / 2];
            } else {
                ans[i] = ans[i - 1] + 1;
            }
        }

        return ans;
    }

    private void operate(int[] res, int n, int count) {
        if (n >= res.length) {
            return;
        }

        res[n] = count;
        n <<= 1;
        operate(res, n + 1, count + 1);
        operate(res, n, count);
    }

    // Complexity: O(n)
    // Space: O(n)
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        operate(res, 1, 1);
        return res;
    }
}
