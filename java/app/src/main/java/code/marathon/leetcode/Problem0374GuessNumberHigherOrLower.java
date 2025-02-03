package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/guess-number-higher-or-lower/">374. Guess Number Higher or Lower</a>
 */
public abstract class Problem0374GuessNumberHigherOrLower implements GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int num = start + ((end - start) / 2);

            int result = guess(num);

            if (result < 0) {
                end = num - 1;
            } else if (result > 0) {
                start = num + 1;
            } else {
                return num;
            }
        }

        return 0;
    }
}
