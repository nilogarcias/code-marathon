package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static code.marathon.leetcode.Problem437PathSumIII.TreeNode;
import static org.junit.jupiter.api.Assertions.*;

class Problem437PathSumIIITest {
    Problem437PathSumIII tested = new Problem437PathSumIII();

    @Test
    void pathSumTestCase1() {
        TreeNode left = new TreeNode(5, new TreeNode(3, new TreeNode(3), new TreeNode(-2)), new TreeNode(2, null,
                new TreeNode(1)));
        TreeNode right = new TreeNode(-3, null, new TreeNode(11));
        TreeNode root = new TreeNode(10, left, right);

        assertEquals(3, tested.pathSum(root, 8));
    }

    @Test
    void pathSumTestCase2() {
        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
        assertEquals(3, tested.pathSum(root, 22));
    }

    @Test
    void pathSumTestCase3() {
        TreeNode root = new TreeNode(1, new TreeNode(-2, new TreeNode(1, new TreeNode(-1), null), new TreeNode(3)),
                new TreeNode(-3, new TreeNode(-2), null));
        assertEquals(4, tested.pathSum(root, -1));
    }

    @Test
    void pathSumTestCase4() {
        TreeNode root = new TreeNode(1_000_000_000, new TreeNode(1_000_000_000, new TreeNode(294_967_296, null,
                new TreeNode(1_000_000_000, null, new TreeNode(1_000_000_000, null, new TreeNode(1_000_000_000)))),
                null), null);
        assertEquals(0, tested.pathSum(root, 0));
    }
}