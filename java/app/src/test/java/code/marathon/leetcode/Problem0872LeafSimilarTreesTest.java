package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0872LeafSimilarTreesTest {
    private final Problem0872LeafSimilarTrees tested = new Problem0872LeafSimilarTrees();

    @Test
    void leafSimilarTestCase1() {
        TreeNode root1 = TreeNode.buildTree(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4);
        TreeNode root2 = TreeNode.buildTree(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8);
        assertTrue(tested.leafSimilar(root1, root2));
    }

    @Test
    void leafSimilarTestCase2() {
        TreeNode root1 = TreeNode.buildTree(1, 2, 3);
        TreeNode root2 = TreeNode.buildTree(1, 3, 2);
        assertFalse(tested.leafSimilar(root1, root2));
    }
}