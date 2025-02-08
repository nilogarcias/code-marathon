package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0700SearchBinarySearchTreeTest {
    private final Problem0700SearchBinarySearchTree tested = new Problem0700SearchBinarySearchTree();

    @Test
    void searchBSTTestCase1() {
        TreeNode root = TreeNode.buildTree(4,2,7,1,3);
        TreeNode result = tested.searchBST(root, 2);
        assertNotNull(result);
        assertEquals(2, result.val);
        assertEquals(1, result.left.val);
        assertEquals(3, result.right.val);
    }

    @Test
    void searchBSTTestCase2() {
        TreeNode root = TreeNode.buildTree(4,2,7,1,3);
        assertNull(tested.searchBST(root, 5));
    }
}