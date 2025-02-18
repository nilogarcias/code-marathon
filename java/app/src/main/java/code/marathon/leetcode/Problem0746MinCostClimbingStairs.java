package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/min-cost-climbing-stairs">746. Min Cost Climbing Stairs</a>
 */
public class Problem0746MinCostClimbingStairs {
    // Complexity: O(n)
    // Space: O(n)
    private int minCostClimbingStairsSpaceN(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[1] = cost[0];
        for (int i = 2; i < n + 1; i++) {
            dp[i] = cost[i - 1] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n], dp[n - 1]);
    }

    // Complexity: O(n)
    // Space: O(1)
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int twoStepsBackMinCost = 0;
        int oneStepsBackMinCost  = 0;
        int nextMinCost = 0;
        for (int i = 2; i <= n; i++) {
            nextMinCost = Math.min(oneStepsBackMinCost + cost[i - 1], twoStepsBackMinCost + cost[i - 2]);
            twoStepsBackMinCost = oneStepsBackMinCost;
            oneStepsBackMinCost = nextMinCost;
        }

        return nextMinCost;
    }
}
