package code.marathon.leetcode;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Problem1372LongestZigZagPathInBinaryTreeTest {
    private final Problem1372LongestZigZagPathInBinaryTree tested = new Problem1372LongestZigZagPathInBinaryTree();

    @Test
    void longestZigZagTestCase1() {
        TreeNode root = TreeNode.buildTree(1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1);
        assertEquals(3, tested.longestZigZag(root));
    }

    @Test
    void longestZigZagTestCase2() {
        TreeNode root = TreeNode.buildTree(1, 1, 1, null, 1, null, null, 1, 1, null, 1);
        assertEquals(4, tested.longestZigZag(root));
    }

    @Test
    void longestZigZagTestCase3() {
        TreeNode root = TreeNode.buildTree(1);
        assertEquals(0, tested.longestZigZag(root));
    }

    @Test
    void longestZigZagTestCase4() throws IOException {
        String resourceName = "1372-testcase4.json";
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(resourceName).getFile());
        ObjectMapper mapper = new ObjectMapper();

        Integer[] nodes = mapper.readValue(file, Integer[].class);
        TreeNode root = TreeNode.buildTree(nodes);
        assertEquals(38_000, tested.longestZigZag(root));
    }
}