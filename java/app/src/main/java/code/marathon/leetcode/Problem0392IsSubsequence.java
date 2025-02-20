package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/is-subsequence/">392. Is Subsequence</a>
 */
public class Problem0392IsSubsequence {
    private boolean isSubsequenceNotOptimized(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int m = s.length();
        int n = t.length();
        if (m == n) {
            return s.equals(t);
        }
        int sIdx = 0;
        int tIdx = 0;

        while (sIdx < m && tIdx < n) {
            while (tIdx < n && t.charAt(tIdx) != s.charAt(sIdx)) {
                tIdx++;
            }
            if (tIdx >= n) {
                return false;
            }
            if (sIdx == (m -1)) {
                return true;
            }
            sIdx++;
            tIdx++;
        }

        return false;
    }

    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m > n) {
            return false;
        }

        int sIdx = 0;
        for (int tIdx = 0; tIdx < n; tIdx++) {
            if (sIdx == m) {
                return true;
            }
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
        }

        return sIdx == m;
    }
}
