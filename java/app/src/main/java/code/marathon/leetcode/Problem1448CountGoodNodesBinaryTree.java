package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/count-good-nodes-in-binary-tree">1448. Count Good Nodes in Binary Tree</a>
 */
public class Problem1448CountGoodNodesBinaryTree {
    private int goodNodesCount = 0;

    private void dfs(TreeNode node, int maxValue) {
        if (node == null) {
            return;
        }

        if (node.val >= maxValue) {
            goodNodesCount++;
        }

        dfs(node.left, Math.max(node.val, maxValue));
        dfs(node.right, Math.max(node.val, maxValue));
    }

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return goodNodesCount;
    }
}
