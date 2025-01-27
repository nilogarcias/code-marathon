package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description">1318. Minimum Flips to Make A OR B Equal to C</a>
 */
public class Problem1318MinimumFlipsMakeAOrBEqualC {
    public int minFlips(int a, int b, int c) {
        int bitsFlipped = 0;
        int bitA;
        int bitB;
        int bitC;

        while (a > 0 || b > 0 || c > 0) {
            bitA = (a & 1);
            bitB = (b & 1);
            bitC = (c & 1);

            if (bitC == 1 && (bitA | bitB) == 0) {
                bitsFlipped++;
            } else if (bitC == 0 && (bitA | bitB) == 1) {
                bitsFlipped += ((bitA & bitB) == 1) ? 2 : 1;
            }

            a >>>= 1;
            b >>>= 1;
            c >>>= 1;
        }

        return bitsFlipped;
    }
}
