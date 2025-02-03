package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem0841KeysAndRoomsTest {
    private final Problem0841KeysAndRooms tested = new Problem0841KeysAndRooms();

    @Test
    void canVisitAllRoomsTestCase1() {
        List<List<Integer>> rooms = List.of(List.of(1), List.of(2), List.of(3), List.of());
        assertTrue(tested.canVisitAllRooms(rooms));
    }

    @Test
    void canVisitAllRoomsTestCase2() {
        List<List<Integer>> rooms = List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0));
        assertFalse(tested.canVisitAllRooms(rooms));
    }

    @Test
    void canVisitAllRoomsTestCase3() {
        List<List<Integer>> rooms = List.of(List.of(2, 3), Collections.emptyList(), Collections.singletonList(2),
                List.of(1, 3));
        assertTrue(tested.canVisitAllRooms(rooms));
    }

    @Test
    void canVisitAllRoomsTestCase4() {
        List<List<Integer>> rooms =
                List.of(List.of(1, 7, 9), List.of(8, 3, 6), List.of(1), List.of(6, 5), List.of(4, 7),
                        List.of(5, 2, 6), List.of(4, 5), List.of(2), List.of(9, 8, 2, 3, 4), List.of(1, 3, 9));
        assertTrue(tested.canVisitAllRooms(rooms));
    }
}