package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/number-of-provinces/">574. Number of Provinces</a>
 */
public class Problem0574NumberProvinces {
    private boolean hasVisitedOtherCities(int[][] isConnected, int city) {
        int totalCitiesVisited = 0;
        for (int otherCity = 0; otherCity < isConnected.length; otherCity++) {
            if (isConnected[city][otherCity] == 1) {
                // mark that connection as visited
                isConnected[city][otherCity] = -1;
                isConnected[otherCity][city] = -1;
                isConnected[otherCity][otherCity] = -1;
                totalCitiesVisited++;
                hasVisitedOtherCities(isConnected, otherCity);
            }
        }
        return totalCitiesVisited > 0;
    }

    private int findCircleNumWithNoAuxStructure(int[][] isConnected) {
        int provinces = 0;

        for (int city = 0; city < isConnected.length; city++) {
            // mark the own city as visited
            isConnected[city][city] = -1;
            provinces += (hasVisitedOtherCities(isConnected, city)) ? 1 : 0;
        }

        return provinces;
    }

    private void dfs(int city, int[][] isConnected, boolean[] visited) {
        visited[city] = true;

        for (int othercity = 0; othercity < isConnected.length; othercity++) {
            if (!visited[othercity] && isConnected[city][othercity] == 1) {
                dfs(othercity, isConnected, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int provinces = 0;

        for (int city = 0; city < isConnected.length; city++) {
            if (!visited[city]) {
                provinces++;
                dfs(city, isConnected, visited);
            }
        }

        return provinces;
    }
}
