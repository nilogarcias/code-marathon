package code.marathon.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/number-of-recent-calls">933. Number of Recent Calls</a>
 * Complexity: O(n)
 * Space: O(n)
 */
public class Problem0933NumberOfRecentCalls {
    static class RecentCounter {
        private final Deque<Integer> requestsTime;

        public RecentCounter() {
            this.requestsTime = new ArrayDeque<>();
        }

        private void registerRequest(int time) {
            requestsTime.addLast(time);
            int beginRangeTime = time - 3000;
            while (!requestsTime.isEmpty() && requestsTime.peekFirst() < beginRangeTime) {
                requestsTime.pollFirst();
            }
        }

        public int ping(int t) {
            registerRequest(t);
            return requestsTime.size();
        }
    }
}
