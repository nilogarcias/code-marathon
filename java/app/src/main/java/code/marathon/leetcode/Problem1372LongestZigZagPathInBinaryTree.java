package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree">1372 - Longest ZigZag Path in a Binary Tree</a>
 * Complexity: O(n)
 * Space: O(1)
 */
public class Problem1372LongestZigZagPathInBinaryTree {
    private int maxZigZag;

    private void maxZigZagPath(TreeNode node, int direction, int zigZagCount) {
        if (node == null) {
            return;
        }

        if (zigZagCount > maxZigZag) {
            maxZigZag = zigZagCount;
        }

        TreeNode nextNode = (direction == 0) ? node.left : node.right;
        int nextDirection = (direction + 1) % 2;
        maxZigZagPath(nextNode, 0, (nextDirection == 0) ? zigZagCount + 1 : 0);
        maxZigZagPath(nextNode, 1, (nextDirection == 1) ? zigZagCount + 1 : 0);
    }

    public int longestZigZag(TreeNode root) {
        maxZigZag = 0;

        maxZigZagPath(root, 0, 0);
        maxZigZagPath(root, 1, 0);

        return maxZigZag;
    }
}
