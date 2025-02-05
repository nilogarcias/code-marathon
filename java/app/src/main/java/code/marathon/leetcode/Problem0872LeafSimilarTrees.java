package code.marathon.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/leaf-similar-trees">872. Leaf-Similar Trees</a>
 */
public class Problem0872LeafSimilarTrees {
    private void dfs(TreeNode node, List<Integer> leafValueSeq) {
        if (node == null) {
            return;
        }

        // Check if the node is leaf
        if (node.left == null && node.right == null) {
            leafValueSeq.add(node.val);
            return;
        }

        dfs(node.left, leafValueSeq);
        dfs(node.right, leafValueSeq);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        dfs(root1, leaf1);
        List<Integer> leaf2 = new ArrayList<>();
        dfs(root2, leaf2);

        return leaf1.equals(leaf2);
    }
}
