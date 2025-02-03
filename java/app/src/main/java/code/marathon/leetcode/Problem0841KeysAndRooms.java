package code.marathon.leetcode;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/keys-and-rooms/description">841. Keys and Rooms</a>
 * Complexity: O(V + E), v = rooms, E = keys in the rooms
 * Space: O(V), v = rooms
 */
public class Problem0841KeysAndRooms {
    private boolean visitRoom(List<List<Integer>> rooms, Set<Integer> roomsToVisit, int room) {
        roomsToVisit.remove(room);

        if (roomsToVisit.isEmpty()) {
            return true;
        }

        for (int roomToVisit : rooms.get(room)) {
            if (roomsToVisit.remove(roomToVisit)) {
                boolean allRoomsVisited = visitRoom(rooms, roomsToVisit, roomToVisit);
                if (allRoomsVisited) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean canVisitAllRoomsWithSet(List<List<Integer>> rooms) {
        Set<Integer> roomsToVisit = IntStream.range(0, rooms.size()).boxed().collect(Collectors.toSet());
        return visitRoom(rooms, roomsToVisit, 0);
    }

    private void dfs(boolean[] visitedRooms, int room, List<List<Integer>> rooms) {
        visitedRooms[room] = true;
        for (int key : rooms.get(room)) {
            if (!visitedRooms[key]) {
                dfs(visitedRooms, key, rooms);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visitedRooms = new boolean[rooms.size()];
        dfs(visitedRooms, 0, rooms);
        for (boolean visitedRoom : visitedRooms) {
            if (!visitedRoom) {
                return false;
            }
        }

        return true;
    }
}
