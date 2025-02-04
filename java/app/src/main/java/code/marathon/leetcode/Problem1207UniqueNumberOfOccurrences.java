package code.marathon.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences">1207. Unique Number of Occurrences</a>
 */
public class Problem1207UniqueNumberOfOccurrences {
    // Complexity: O(n)
    // Space: O(n)
    private boolean uniqueOccurrencesUsingMapAndSet(int[] arr) {
        Map<Integer, Integer> numOccurrences = new HashMap<>();

        for (int num : arr) {
            numOccurrences.put(num, numOccurrences.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrences = new HashSet<>();
        for (int occurrence : numOccurrences.values()) {
            if (occurrences.contains(occurrence)) {
                return false;
            }
            occurrences.add(occurrence);
        }

        return true;
    }

    // Complexity: O(n)
    // Space: O(n)
    public boolean uniqueOccurrences(int[] arr) {
        int[] occurrences = new int[2001];

        for (int num : arr) {
            occurrences[num + 1000]++;
        }

        boolean[] containOccurrence = new boolean[2001];
        for (int num : arr) {
            if (occurrences[num + 1000] > 0 && containOccurrence[occurrences[num + 1000]]) {
                return false;
            }
            containOccurrence[occurrences[num + 1000]] = true;
            occurrences[num + 1000] = 0;
        }

        return true;
    }
}
