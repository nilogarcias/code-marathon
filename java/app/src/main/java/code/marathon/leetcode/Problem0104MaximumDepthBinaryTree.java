package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree">104. Maximum Depth of a Binary Tree</a>
 */
public class Problem0104MaximumDepthBinaryTree {
    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        int leftDepth = dfs(node.left, depth + 1);
        int rightDepth = dfs(node.right, depth + 1);

        return Math.max(leftDepth, rightDepth);
    }

    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }
}
