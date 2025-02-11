package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0450DeleteNodeBSTTest {
    private final Problem0450DeleteNodeBST tested = new Problem0450DeleteNodeBST();

    private void assertTree(TreeNode expected, TreeNode node) {
        if (expected == null) {
            assertNull(node);
        } else {
            assertNotNull(node);
            assertEquals(expected.val, node.val);
            assertTree(node.left, expected.left);
            assertTree(node.right, expected.right);
        }
    }

    @Test
    void deleteNodeTestCase1() {
        TreeNode root = TreeNode.buildTree(5, 3, 6, 2, 4, null, 7);
        TreeNode expected = TreeNode.buildTree(5, 2, 6, null, 4, null, 7);
        root = tested.deleteNode(root, 3);
        assertTree(expected, root);
    }

    @Test
    void deleteNodeTestCase2() {
        TreeNode root = TreeNode.buildTree(5, 3, 6, 2, 4, null, 7);
        TreeNode expected = TreeNode.buildTree(5, 3, 6, 2, 4, null, 7);
        root = tested.deleteNode(root, 0);
        assertTree(expected, root);
    }

    @Test
    void deleteNodeTestCase3() {
        assertNull(tested.deleteNode(null, 0));
    }
}