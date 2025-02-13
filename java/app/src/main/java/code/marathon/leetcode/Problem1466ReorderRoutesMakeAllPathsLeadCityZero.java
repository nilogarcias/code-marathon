package code.marathon.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <a href="https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/">1466. Reorder Routes to Make All Paths Lead to the City Zero</a>
 */
public class Problem1466ReorderRoutesMakeAllPathsLeadCityZero {
    private void dfsMap(int city, Map<Integer, List<Integer>> actualRoads, Map<Integer, List<Integer>> undirectedRoads, boolean[] visitedCities, AtomicInteger reorderedRoads) {
        visitedCities[city] = true;

        for (int neighboringCity : undirectedRoads.get(city)) {
            if (!visitedCities[neighboringCity]) {
                if (!actualRoads.containsKey(neighboringCity) || !actualRoads.get(neighboringCity).contains(city)) {
                    reorderedRoads.incrementAndGet();
                }
                dfsMap(neighboringCity, actualRoads, undirectedRoads, visitedCities, reorderedRoads);
            }
        }
    }

    // Initial try
    private int minReorderGraphMap(int n, int[][] connections) {
        Map<Integer, List<Integer>> actualRoads = new HashMap<>();
        Map<Integer, List<Integer>> undirectedRoads = new HashMap<>();

        for (int[] road : connections) {
            actualRoads.computeIfAbsent(road[0], k -> new ArrayList<>()).add(road[1]);
            undirectedRoads.computeIfAbsent(road[0], k -> new ArrayList<>()).add(road[1]);
            undirectedRoads.computeIfAbsent(road[1], k -> new ArrayList<>()).add(road[0]);
        }

        boolean[] visitedCities = new boolean[n];
        AtomicInteger reorderedRoads = new AtomicInteger();
        dfsMap(0, actualRoads, undirectedRoads, visitedCities, reorderedRoads);

        return reorderedRoads.get();
    }

    private int dfs(int fromCity, List<List<Integer>> roads, boolean[] visitedCities) {
        int changedRoads = 0;
        visitedCities[fromCity] = true;

        for (int toCity : roads.get(fromCity)) {
            if (!visitedCities[Math.abs(toCity)]) {
                changedRoads += (dfs(Math.abs(toCity), roads, visitedCities) + (toCity > 0 ? 1 : 0));
            }
        }

        return changedRoads;
    }

    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> roads = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            roads.add(new ArrayList<>());
        }

        for (int[] road : connections) {
            roads.get(road[0]).add(road[1]);
            roads.get(road[1]).add(-road[0]);
        }

        return dfs(0, roads, new boolean[n]);
    }
}
