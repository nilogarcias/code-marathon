package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/daily-temperatures">739. Daily Temperatures</a>
 */
public class Problem0739DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        // Using a int[] instead ArrayDeque<Integer> for performance
        int[] tempIdxStack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && temperatures[tempIdxStack[top]] < temperatures[i]) {
                answer[tempIdxStack[top]] = i - tempIdxStack[top];
                top--;
            }
            tempIdxStack[++top] = i;
        }

        return answer;
    }
}
