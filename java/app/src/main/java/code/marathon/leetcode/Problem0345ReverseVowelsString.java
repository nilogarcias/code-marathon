package code.marathon.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/description">345 - Reverse Vowels of a String</a>
 * O(n)
 */
public class Problem0345ReverseVowelsString {
    static boolean[] isVowel = new boolean[256];

    static {
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;
        isVowel['A'] = true;
        isVowel['E'] = true;
        isVowel['I'] = true;
        isVowel['O'] = true;
        isVowel['U'] = true;
    }

    private String solutionTwoPointers(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            while (i < j && !isVowel[arr[i]]) {
                i++;
            }
            while (i < j && !isVowel[arr[j]]) {
                j--;
            }
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        return new String(arr);
    }

    private static boolean isVowel(char letter) {
        return switch (letter) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            case 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        List<Character> vowels = new ArrayList<>();
        char letter;
        for (int i = s.length() - 1; i >= 0; i--) {
            letter = s.charAt(i);
            if (isVowel(letter)) {
                vowels.add(letter);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            sb.append(isVowel(letter) ? vowels.removeFirst() : letter);
        }

        return sb.toString();
    }
}
