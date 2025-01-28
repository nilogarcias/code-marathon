package code.marathon.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/dota2-senate/description">649. Dota2 Senate</a>
 */
public class Problem0649Dota2Senate {
    private String predictPartyVictoryStringBuilder(String senate) {
        int radiantBans = 0;
        int direBans = 0;
        StringBuilder leftSenators = new StringBuilder(senate);

        while (leftSenators.length() > 1) {
            String currentSenate = leftSenators.toString();
            leftSenators.setLength(0);
            for (char senator : currentSenate.toCharArray()) {
                if (senator == 'R') {
                    if (radiantBans > 0) {
                        radiantBans--;
                    } else {
                        direBans++;
                        leftSenators.append(senator);
                    }
                } else {
                    if (direBans > 0) {
                        direBans--;
                    } else {
                        radiantBans++;
                        leftSenators.append(senator);
                    }
                }
            }
            if (currentSenate.contentEquals(leftSenators)) {
                break;
            }
        }

        if (radiantBans == direBans) {
            return ("D".contentEquals(leftSenators)) ? "Dire" : "Radiant";
        }

        return (radiantBans < direBans) ? "Radiant" : "Dire";
    }

    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();
        int senateSize = senate.length();

        // Populate the queues
        for (int i = 0; i < senateSize; i++) {
            if (senate.charAt(i) == 'D') {
                direQueue.add(i);
            } else {
                radiantQueue.add(i);
            }
        }

        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int radiantVoteOrder = radiantQueue.poll();
            int direVoteOrder = direQueue.poll();
            if (radiantVoteOrder < direVoteOrder) {
                radiantQueue.add(radiantVoteOrder + senateSize);
            } else {
                direQueue.add(direVoteOrder + senateSize);
            }
        }

        return radiantQueue.size() > direQueue.size() ? "Radiant" : "Dire";
    }
}
