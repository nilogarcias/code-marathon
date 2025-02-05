package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/merge-strings-alternately">1768. Merge Strings Alternately</a>
 */
public class Problem1768MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder(word1.length() + word2.length());
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(i));
        }

        if (len1 > len2) {
            merge.append(word1.substring(len2));
        } else if (len1 < len2) {
            merge.append(word2.substring(len1));
        }

        return merge.toString();
    }
}
