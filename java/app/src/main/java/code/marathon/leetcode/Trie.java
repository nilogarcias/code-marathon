package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/implement-trie-prefix-tree">208. Implement Trie (Prefix Tree)</a>
 */
public class Trie {
    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        root.insert(word, 0);
    }

    public boolean search(String word) {
        return root.search(word, 0, true);
    }

    public boolean startsWith(String prefix) {
        return root.search(prefix, 0, false);
    }

    static class TrieNode {
        private final TrieNode[] nodes;
        private boolean isEnd;

        TrieNode() {
            nodes = new TrieNode['z' - 'a' + 1];
        }

        private void insert(String word, int idx) {
            if (idx >= word.length()) {
                return;
            }

            int i = word.charAt(idx) - 'a';
            if (nodes[i] == null) {
                nodes[i] = new TrieNode();
            }

            if ((idx == word.length() - 1)) {
                nodes[i].isEnd = true;
            }

            nodes[i].insert(word, idx + 1);
        }

        private boolean search(String word, int idx, boolean strictSearch) {
            if (idx >= word.length()) {
                return false;
            }

            TrieNode node = nodes[word.charAt(idx) - 'a'];
            if (node == null) {
                return false;
            }

            if (idx == word.length() - 1) {
                return !strictSearch || node.isEnd;
            }

            return node.search(word, idx + 1, strictSearch);
        }
    }
}
