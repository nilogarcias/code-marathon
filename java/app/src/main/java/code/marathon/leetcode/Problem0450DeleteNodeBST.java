package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/delete-node-in-a-bst/">450. Delete Node in a Binary Search Tree</a>
 */
public class Problem0450DeleteNodeBST {
    private TreeNode findDeleteNode(TreeNode previousNode, TreeNode currentNode, int key) {
        if (currentNode == null) {
            return null;
        }

        if (currentNode.val == key) {
            if (previousNode != null) {
                if (previousNode.left != null && previousNode.left.val == currentNode.val) {
                    previousNode.left = null;
                }
                if (previousNode.right != null && previousNode.right.val == currentNode.val) {
                    previousNode.right = null;
                }
            }
            return currentNode;
        }

        if (currentNode.val > key) {
            return findDeleteNode(currentNode, currentNode.left, key);
        }

        return findDeleteNode(currentNode, currentNode.right, key);
    }

    private void insertNode(TreeNode node, TreeNode newNode) {
        if (node.val > newNode.val) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertNode(node.left, newNode);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertNode(node.right, newNode);
            }
        }
    }

    private void addNode(TreeNode root, TreeNode remainTree) {
        if (remainTree == null) {
            return;
        }

        TreeNode leftTree = remainTree.left;
        TreeNode rightTree = remainTree.right;

        remainTree.left = null;
        remainTree.right = null;

        insertNode(root, remainTree);

        addNode(root, leftTree);
        addNode(root, rightTree);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode deletedNode = findDeleteNode(null, root, key);

        if (deletedNode == null) {
            return root;
        }

        if (deletedNode.val == root.val) {
            TreeNode newRoot = (deletedNode.right != null) ? deletedNode.right : deletedNode.left;
            TreeNode remainTree = (deletedNode.right != null) ? deletedNode.left : deletedNode.right;

            if (newRoot != null) {
                addNode(newRoot, remainTree);
            }

            return newRoot;
        }

        addNode(root, deletedNode.left);
        addNode(root, deletedNode.right);
        return root;
    }
}
