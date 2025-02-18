package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void testCase1() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));
        trie.insert("app");
        assertTrue(trie.search("app"));
    }

    @Test
    void testCase2() {
        Trie trie = new Trie();
        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");
        assertFalse(trie.search("apps"));
        assertTrue(trie.search("app"));
        assertFalse(trie.search("ad"));
        assertFalse(trie.search("applepie"));
        assertFalse(trie.search("rest"));
        assertFalse(trie.search("jan"));
        assertFalse(trie.search("rent"));
        assertTrue(trie.search("beer"));
        assertTrue(trie.search("jam"));
        assertFalse(trie.startsWith("apps"));
        assertTrue(trie.startsWith("app"));
        assertTrue(trie.startsWith("ad"));
        assertFalse(trie.startsWith("applepie"));
        assertFalse(trie.startsWith("rest"));
        assertFalse(trie.startsWith("jan"));
        assertTrue(trie.startsWith("rent"));
        assertTrue(trie.startsWith("beer"));
        assertTrue(trie.startsWith("jam"));
    }
}