package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0236LowestCommonAncestorBinaryTreeTest {
    private final Problem0236LowestCommonAncestorBinaryTree tested = new Problem0236LowestCommonAncestorBinaryTree();

    @Test
    void lowestCommonAncestorTestCase1() {
        TreeNode root = TreeNode.buildTree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        assertEquals(3, tested.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1)).val);
    }

    @Test
    void lowestCommonAncestorTestCase2() {
        TreeNode root = TreeNode.buildTree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        assertEquals(5, tested.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4)).val);
    }
    @Test
    void lowestCommonAncestorTestCase3() {
        TreeNode root = TreeNode.buildTree(1, 2, null);
        assertEquals(1, tested.lowestCommonAncestor(root, new TreeNode(1), new TreeNode(2)).val);
    }
}