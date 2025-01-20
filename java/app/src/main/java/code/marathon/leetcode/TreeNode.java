package code.marathon.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    private static TreeNode buildNode(Integer val) {
        return (val == null) ? null : new TreeNode(val);
    }

    public static TreeNode buildTree(Integer... nodes) {
        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> nodesToProcess = new ArrayDeque<>();
        nodesToProcess.add(root);

        int nodesIdx = 1;
        while (!nodesToProcess.isEmpty()) {
            TreeNode node = nodesToProcess.poll();

            if (nodesIdx < nodes.length) {
                node.left = buildNode(nodes[nodesIdx++]);
            }
            if (nodesIdx < nodes.length) {
                node.right = buildNode(nodes[nodesIdx++]);
            }

            if (node.left != null) {
                nodesToProcess.add(node.left);
            }
            if (node.right != null) {
                nodesToProcess.add(node.right);
            }
        }

        return root;
    }
}
