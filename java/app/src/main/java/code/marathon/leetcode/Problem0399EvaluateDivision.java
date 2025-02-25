package code.marathon.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/evaluate-division/">399. Evaluate Division</a>
 * Approach using a Adjacent Matrix
 */
public class Problem0399EvaluateDivision {
    private int getVariableIndex(List<String> variables, String variable) {
        int varIndex = variables.indexOf(variable);
        if (varIndex < 0) {
            variables.add(variable);
            return variables.indexOf(variable);
        }

        return varIndex;
    }

    private double dfs(double[][] adjMatrix, int var1, int var2, Set<Integer> visitedVariables, double value) {
        if (var1 < 0 || var2 < 0) {
            return -1.0;
        }
        if (var1 == var2) {
            return value;
        }

        visitedVariables.add(var1);

        for (int i = 0; i < adjMatrix[var1].length; i++) {
            if (!visitedVariables.contains(i) && adjMatrix[var1][i] != 0) {
                double result = dfs(adjMatrix, i, var2, visitedVariables, value * adjMatrix[var1][i]);
                if (result > 0) {
                    return result;
                }
            }
        }

        visitedVariables.remove(var1);
        return -1;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[][] adjMatrix = new double[25][25];
        List<String> variables = new ArrayList<>(25);
        double[] answer = new double[queries.size()];

        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String var1 = equation.get(0);
            int var1Idx = getVariableIndex(variables, var1);
            String var2 = equation.get(1);
            int var2Idx = getVariableIndex(variables, var2);
            adjMatrix[var1Idx][var1Idx] = 1.0;
            adjMatrix[var2Idx][var2Idx] = 1.0;
            adjMatrix[var1Idx][var2Idx] = values[i];
            adjMatrix[var2Idx][var1Idx] = 1.0 / values[i];
        }

        Set<Integer> visitedVariables = new HashSet<>(25);
        for (int i = 0; i < queries.size(); i++) {
            List<String> equation = queries.get(i);
            String var1 = equation.get(0);
            int var1Idx = variables.indexOf(var1);
            String var2 = equation.get(1);
            int var2Idx = variables.indexOf(var2);
            visitedVariables.clear();
            answer[i] = dfs(adjMatrix, var1Idx, var2Idx, visitedVariables, 1);
        }

        return answer;
    }
}
