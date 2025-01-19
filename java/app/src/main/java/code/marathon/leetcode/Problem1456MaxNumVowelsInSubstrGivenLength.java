package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description">1456. Maximum Number of Vowels in a Substring of Given Length</a>
 * Complexity O(n)
 * Space O(1)
 */
public class Problem1456MaxNumVowelsInSubstrGivenLength {
    private boolean isVowel(char letter) {
        return switch (letter) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    public int maxVowels(String s, int k) {
        int currentVowelsCount = 0;
        // Count the vowels from the first substring
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelsCount++;
            }
        }
        int maxVowelsCount = currentVowelsCount;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelsCount++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentVowelsCount--;
            }
            maxVowelsCount = Math.max(maxVowelsCount, currentVowelsCount);
        }

        return maxVowelsCount;
    }
}
