package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/removing-stars-from-a-string/description">2390 - Removing Stars from a String</a>
 * Complexity: O(n)
 * Space: O(n)
 */
public class Problem2390RemovingStarsFromString {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char letter : s.toCharArray()) {
            if (letter != '*') {
                sb.append(letter);
            } else {
                sb.setLength(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
