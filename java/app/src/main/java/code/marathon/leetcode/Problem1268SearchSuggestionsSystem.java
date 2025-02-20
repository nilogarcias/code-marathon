package code.marathon.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1268SearchSuggestionsSystem {
    static class TrieNode {
        private final TrieNode[] nodes = new TrieNode['z' - 'a' + 1];
        private boolean isEnd;

        public void insert(String word, int idx) {
            if (idx >= word.length()) {
                return;
            }
            char letter = word.charAt(idx);
            TrieNode node = nodes[letter - 'a'];
            if (node == null) {
                node = new TrieNode();
                nodes[letter - 'a'] = node;
            }

            if ((idx == word.length() - 1)) {
                node.isEnd = true;
            }

            node.insert(word, idx + 1);
        }

        public void prefix(String word, int lettersTyped, List<String> result, String wordFound) {
            if (result.size() == 3) {
                return;
            }

            if (this.isEnd && wordFound.length() >= lettersTyped) {
                result.add(wordFound);
            }

            int wordIdx = wordFound.length();
            for (int i = 0; i < nodes.length; i++) {
                TrieNode node = nodes[i];
                if (node != null) {
                    if (wordIdx < lettersTyped) {
                        if (word.charAt(wordIdx) - 'a' == i) {
                            node.prefix(word, lettersTyped, result, wordFound + (char) ('a' + i));
                        }
                    } else {
                        node.prefix(word, lettersTyped, result, wordFound + (char) ('a' + i));
                    }
                }
            }
        }
    }

    static class Trie {
        private final TrieNode root = new TrieNode();

        public void insert(String word) {
            root.insert(word, 0);
        }

        public List<String> prefix(String word, int lettersTyped) {
            List<String> result = new ArrayList<>(3);
            root.prefix(word, lettersTyped, result, "");
            return result;
        }
    }

    private List<List<String>> suggestedProductsUsingTrie(String[] products, String searchWord) {
        Trie trie = new Trie();
        for (String product : products) {
            trie.insert(product);
        }

        List<List<String>> answer = new ArrayList<>(searchWord.length());
        for (int i = 1; i <= searchWord.length(); i++) {
            answer.add(trie.prefix(searchWord, i));
        }

        return answer;
    }

    // Better performance over Trie
    private List<String> findMatchingWords(String[] products, int[] searchSpace, int prefixIndex, char prefixChar) {
        int left = searchSpace[0];
        int right = searchSpace[1];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].length() <= prefixIndex || products[mid].charAt(prefixIndex) < prefixChar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        searchSpace[0] = left;

        right = searchSpace[1];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].length() <= prefixIndex || products[mid].charAt(prefixIndex) > prefixChar) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        searchSpace[1] = right;

        List<String> topMatchingWords = new ArrayList<>(3);
        for (int i = searchSpace[0]; i <= searchSpace[1] && topMatchingWords.size() < 3; i++) {
            topMatchingWords.add(products[i]);
        }

        return topMatchingWords;
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        List<List<String>> answer = new ArrayList<>(searchWord.length());
        int[] searchSpace = new int[2];
        searchSpace[1] = products.length - 1;
        for (int i = 0; i < searchWord.length(); i++) {
            answer.add(findMatchingWords(products, searchSpace, i, searchWord.charAt(i)));
        }

        return answer;
    }
}
