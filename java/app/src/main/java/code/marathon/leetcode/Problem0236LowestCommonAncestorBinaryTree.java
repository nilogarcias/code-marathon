package code.marathon.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description">236. Lowest Common Ancestor of a Binary Tree</a>
 */
public class Problem0236LowestCommonAncestorBinaryTree {
    private boolean ancestors(Deque<TreeNode> ancestorsList, TreeNode node, int val) {
        if (node == null) {
            return false;
        }

        if (node.val == val) {
            ancestorsList.addLast(node);
            return true;
        }

        if (ancestors(ancestorsList, node.left, val)) {
            ancestorsList.addLast(node);
            return true;
        }

        if (ancestors(ancestorsList, node.right, val)) {
            ancestorsList.addLast(node);
            return true;
        }

        return false;
    }

    // Complexity: O(n)
    // Space: O(n)
    private TreeNode lowestCommonAncestorBuildingAncestorList(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> ancestorsP = new ArrayDeque<>();
        Deque<TreeNode> ancestorsQ = new ArrayDeque<>();
        ancestors(ancestorsP, root, p.val);
        ancestors(ancestorsQ, root, q.val);

        TreeNode lcaNode = null;
        while (!ancestorsP.isEmpty() && !ancestorsQ.isEmpty()) {
            if (ancestorsP.peekLast().val == ancestorsQ.peekLast().val) {
                lcaNode = ancestorsP.peekLast();
            }

            ancestorsP.pollLast();
            ancestorsQ.pollLast();
        }

        return lcaNode;
    }


    // Complexity: O(n)
    // Space: O(1)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }
}
