package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1448CountGoodNodesBinaryTreeTest {
    private final Problem1448CountGoodNodesBinaryTree tested = new Problem1448CountGoodNodesBinaryTree();

    @Test
    void goodNodesTestCase1() {
        TreeNode root = TreeNode.buildTree(3,1,4,3,null,1,5);
        assertEquals(4, tested.goodNodes(root));
    }

    @Test
    void goodNodesTestCase2() {
        TreeNode root = TreeNode.buildTree(3,3,null,4,2);
        assertEquals(3, tested.goodNodes(root));
    }

    @Test
    void goodNodesTestCase3() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, tested.goodNodes(root));
    }
}