package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1161MaximumLevelSumBinaryTreeTest {
    private final Problem1161MaximumLevelSumBinaryTree tested = new Problem1161MaximumLevelSumBinaryTree();

    @Test
    void maxLevelSumTestCase1() {
        TreeNode root = TreeNode.buildTree(1, 7, 0, 7, -8, null, null);
        assertEquals(2, tested.maxLevelSum(root));
    }

    @Test
    void maxLevelSumTestCase2() {
        TreeNode root = TreeNode.buildTree(989, null, 10250, 98693, -89388, null, null, null, -32127);
        assertEquals(2, tested.maxLevelSum(root));
    }

    @Test
    void maxLevelSumTestCase3() {
        TreeNode root = TreeNode.buildTree(1);
        assertEquals(1, tested.maxLevelSum(root));
    }
}