package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0649Dota2SenateTest {
    private final Problem0649Dota2Senate tested = new Problem0649Dota2Senate();

    @Test
    void predictPartyVictoryTestCase1() {
        assertEquals("Radiant", tested.predictPartyVictory("RD"));
    }

    @Test
    void predictPartyVictoryTestCase2() {
        assertEquals("Dire", tested.predictPartyVictory("RDD"));
    }

    @Test
    void predictPartyVictoryTestCase3() {
        assertEquals("Dire", tested.predictPartyVictory("DR"));
    }

    @Test
    void predictPartyVictoryTestCase4() {
        assertEquals("Radiant", tested.predictPartyVictory("RRR"));
    }

    @Test
    void predictPartyVictoryTestCase5() {
        assertEquals("Dire", tested.predictPartyVictory("DDRRR"));
    }

    @Test
    void predictPartyVictoryTestCase6() {
        assertEquals("Radiant", tested.predictPartyVictory("RDR"));
    }
}