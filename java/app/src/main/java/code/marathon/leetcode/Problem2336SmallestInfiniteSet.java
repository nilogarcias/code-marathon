package code.marathon.leetcode;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <a href="https://leetcode.com/problems/smallest-number-in-infinite-set/description">2336 - Smallest Number in a Infinite Set</a>
 * Complexity: O(log n)
 * Space: O(n)
 */
public class Problem2336SmallestInfiniteSet {
    private int smallestNumber = 1;
    private final SortedSet<Integer> backedNumbers = new TreeSet<>();

    public Problem2336SmallestInfiniteSet() {
    }

    public int popSmallest() {
        if (backedNumbers.isEmpty()) {
            return smallestNumber++;
        } else {
            int smallestBackedNumber = backedNumbers.first();
            if (smallestNumber < smallestBackedNumber) {
                return smallestNumber++;
            }
            backedNumbers.remove(smallestBackedNumber);
            return smallestBackedNumber;
        }
    }

    public void addBack(int num) {
        if (num < smallestNumber) {
            backedNumbers.add(num);
        }
    }
}
