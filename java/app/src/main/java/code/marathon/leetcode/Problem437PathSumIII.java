package code.marathon.leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <a href="https://leetcode.com/problems/path-sum-iii/description/">Path Sum III</a>
 * [ Time taken: 34 m 0 s ]
 */
public class Problem437PathSumIII {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int dfsPathSum(TreeNode root, long sum, int targetSum) {
        if (root == null) {
            return 0;
        }

        long currentSum = sum + root.val;
        int pathCount = (currentSum == targetSum) ? 1 : 0;
        if (root.left != null) {
            pathCount += dfsPathSum(root.left, currentSum, targetSum);
        }

        if (root.right != null) {
            pathCount += dfsPathSum(root.right, currentSum, targetSum);
        }

        return pathCount;
    }

    /**
     * Solution ~ O(n*4)
     * n + 2(n-1) + 4(n - 3) + 8(n - 7)
     * 1 + 2 + 4 + 8 + 16
     * 2^5
     * 31 + (15 + 15) + (7 + 7 + 7 + 7) + (3 + 3 + 3 + 3 + 3 + 3 + 3 + 3) + (1 * 16)
     * 125
     * n = 32
     * iter = 125
     * @param root Root node
     * @param targetSum Target sum
     * @return Count of paths where the target sum was found
     */
    private int bfsAndDfsSolution(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int pathCount = 0;
        // BFS
        Queue<TreeNode> rootNodes = new ArrayDeque<>();
        rootNodes.add(root);
        while (!rootNodes.isEmpty()) {
            TreeNode currentRoot = rootNodes.poll();
            pathCount += dfsPathSum(currentRoot, 0, targetSum);
            if (currentRoot.left != null) {
                rootNodes.add(currentRoot.left);
            }
            if (currentRoot.right != null) {
                rootNodes.add(currentRoot.right);
            }
        }

        return pathCount;
    }

    private void traversal(TreeNode root, long sum, int targetSum, HashMap<Long, Integer> prefixSumMap,
            AtomicInteger pathCount) {
        if (root == null) {
            return;
        }

        long currentSum = sum + root.val;
        if (currentSum == targetSum) {
            pathCount.incrementAndGet();
        }
        long diff = currentSum - targetSum;
        if (prefixSumMap.containsKey(diff)) {
            pathCount.addAndGet(prefixSumMap.get(diff));
        }

        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        traversal(root.left, currentSum, targetSum, prefixSumMap, pathCount);
        traversal(root.right, currentSum, targetSum, prefixSumMap, pathCount);
        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) - 1);

    }

    /**
     * Solution O(n)
     * @param root Root node
     * @param targetSum Target sum
     * @return Count of paths where the target sum was found
     */
    private int prefixMapSum(TreeNode root, int targetSum) {
        AtomicInteger pathCount = new AtomicInteger(0);
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();

        traversal(root, 0, targetSum, prefixSumMap, pathCount);

        return pathCount.intValue();
    }

    public int pathSum(TreeNode root, int targetSum) {
        return prefixMapSum(root, targetSum);
    }
}
