package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem0102BinaryTreeLevelOrderTraversalTest {
    private final Problem0102BinaryTreeLevelOrderTraversal tested = new Problem0102BinaryTreeLevelOrderTraversal();

    @Test
    void levelOrderTestCase1() {
        TreeNode root = TreeNode.buildTree(3, 9, 20, null, null, 15, 7);
        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        assertEquals(expected, tested.levelOrder(root));
    }

    @Test
    void levelOrderTestCase2() {
        assertEquals(List.of(List.of(1)), tested.levelOrder(TreeNode.buildTree(1)));
    }

    @Test
    void levelOrderTestCase3() {
        assertEquals(Collections.emptyList(), tested.levelOrder(null));
    }
}