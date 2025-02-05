package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0104MaximumDepthBinaryTreeTest {
    private final Problem0104MaximumDepthBinaryTree tested = new Problem0104MaximumDepthBinaryTree();

    @Test
    void maxDepthTestCase1() {
        TreeNode root = TreeNode.buildTree(3, 9, 20, null, null, 15, 7);
        assertEquals(3, tested.maxDepth(root));
    }

    @Test
    void maxDepthTestCase2() {
        TreeNode root = TreeNode.buildTree(1,null,2);
        assertEquals(2, tested.maxDepth(root));
    }

    @Test
    void maxDepthTestCase3() {
        assertEquals(0, tested.maxDepth(null));
    }
}