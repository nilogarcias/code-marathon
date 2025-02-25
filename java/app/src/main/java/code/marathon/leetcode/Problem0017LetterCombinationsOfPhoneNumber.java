package code.marathon.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">17. Letter Combinations Of a Phone Number</a>
 */
public class Problem0017LetterCombinationsOfPhoneNumber {
    private final String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private void combineDigits(String digits, int index, StringBuilder prefix, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(prefix.toString());
            return;
        }

        String digitLetters = phone[digits.charAt(index) - '0'];

        for (char letter : digitLetters.toCharArray()) {
            prefix.append(letter);
            combineDigits(digits, index + 1, prefix, combinations);
            prefix.setLength(index);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }

        // Max number of possible combinations:
        // 0 <= digits.length <= 4
        // 7 and 9 has 4 letters => 4 * 4 * 4 * 4 = 256
        List<String> answer = new ArrayList<>(256);
        StringBuilder prefix = new StringBuilder(digits.length());

        combineDigits(digits, 0, prefix, answer);

        return answer;
    }
}
