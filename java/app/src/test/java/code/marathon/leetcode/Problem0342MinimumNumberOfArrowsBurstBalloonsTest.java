package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem0342MinimumNumberOfArrowsBurstBalloonsTest {
    private final Problem0342MinimumNumberOfArrowsBurstBalloons tested =
            new Problem0342MinimumNumberOfArrowsBurstBalloons();

    @Test
    void findMinArrowShotsTestCase1() {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        assertEquals(2, tested.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShotsTestCase2() {
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        assertEquals(4, tested.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShotsTestCase3() {
        int[][] points = {{1,2},{2,3},{3,4},{4,5}};
        assertEquals(2, tested.findMinArrowShots(points));
    }

    @Test
    void findMinArrowShotsTestCase4() {
        int[][] points = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        assertEquals(2, tested.findMinArrowShots(points));
    }
}