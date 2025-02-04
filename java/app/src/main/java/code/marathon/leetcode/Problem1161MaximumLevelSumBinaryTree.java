package code.marathon.leetcode;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree">1161. Maximum Level Sum of a Binary Tree</a>
 */
public class Problem1161MaximumLevelSumBinaryTree {

    private int maxLevelSumWithHashMap(TreeNode root) {
        int minLevel = 1;
        int maxSum = Integer.MIN_VALUE;
        Map<Integer, Integer> levelSumMap = new HashMap<>();
        Queue<Map.Entry<Integer, TreeNode>> nodes = new ArrayDeque<>();
        nodes.add(new AbstractMap.SimpleEntry<>(1, root));

        while (!nodes.isEmpty()) {
            Map.Entry<Integer, TreeNode> levelNode = nodes.poll();
            int level = levelNode.getKey();
            TreeNode node = levelNode.getValue();
            levelSumMap.put(level, levelSumMap.getOrDefault(level, 0) + node.val);

            if (node.left != null) {
                nodes.add(new AbstractMap.SimpleEntry<>(level + 1, node.left));
            }

            if (node.right != null) {
                nodes.add(new AbstractMap.SimpleEntry<>(level + 1, node.right));
            }
        }

        for (Map.Entry<Integer, Integer> levelSum : levelSumMap.entrySet()) {
            if (levelSum.getValue() > maxSum) {
                maxSum = levelSum.getValue();
                minLevel = levelSum.getKey();
            }
        }

        return minLevel;
    }

    public int maxLevelSum(TreeNode root) {
        int level = 1;
        int minLevel = 1;
        int levelSum;
        int maxLevelSum = root.val;

        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            levelSum = 0;
            for (int i = nodes.size(); i > 0; i--) {
                TreeNode node = nodes.poll();

                if (node != null) {
                    levelSum += node.val;

                    if (node.left != null) {
                        nodes.offer(node.left);
                    }
                    if (node.right != null) {
                        nodes.offer(node.right);
                    }
                }
            }

            if (levelSum > maxLevelSum) {
                maxLevelSum = levelSum;
                minLevel = level;
            }
            level++;
        }

        return minLevel;
    }
}