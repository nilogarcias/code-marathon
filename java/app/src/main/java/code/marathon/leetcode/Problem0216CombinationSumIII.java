package code.marathon.leetcode;

import java.util.*;

//
// [ Time taken: 54 m 9 s ]
public class Problem0216CombinationSumIII {
    private void combinationSum(Set<Integer> possibleNumbers, Set<Integer> usedNumbers, int currentSum, int targetSum,
            int k, List<List<Integer>> combinations) {
        if (usedNumbers.size() == k && currentSum == targetSum) {
            List<Integer> combination = new ArrayList<>(usedNumbers);
            if (!combinations.contains(combination)) {
                combinations.add(combination);
            }
            return;
        }

        if (currentSum < targetSum && usedNumbers.size() < k) {
            for (int i = 1; i < 10; i++) {
                if (possibleNumbers.remove(i)) {
                    if (currentSum + i <= targetSum) {
                        usedNumbers.add(i);
                        combinationSum(possibleNumbers, usedNumbers, currentSum + i, targetSum, k, combinations);
                        usedNumbers.remove(i);
                    }
                }
            }
        }
    }

    private List<List<Integer>> combinationSumRemovingDuplications(int k, int n) {
        int minimalSum = 0;
        for (int i = 1; i <= k; i++) {
            minimalSum += i;
        }

        if (n < minimalSum) {
            return Collections.emptyList();
        }

        List<List<Integer>> combinations = new ArrayList<>();
        Set<Integer> possibleNumbers = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i = 1; i < 9; i++) {
            possibleNumbers.remove(i);
            Set<Integer> usedNumbers = new HashSet<>();
            usedNumbers.add(i);
            combinationSum(possibleNumbers, usedNumbers, i, n, k, combinations);
        }

        return combinations;
    }

    private void findCombinations(List<List<Integer>> result, List<Integer> currentCombination, int currentSum, int start, int targetSum, int totalNumbers) {
        // Base case: if the current combination has the required number of elements
        if (currentCombination.size() == totalNumbers && currentSum == targetSum) {
            // Add a valid combination to the result    
            result.add(new ArrayList<>(currentCombination));
            // Stop further recursion
            return; 
        }

        // If the start number exceeds 9, no more valid combinations are possible
        if (start > 9) {
            return;
        }

        // Include the current number in the combination
        currentCombination.add(start);
        findCombinations(result, currentCombination, currentSum + start, start + 1, targetSum, totalNumbers);

        // Backtrack by removing the current number
        currentCombination.removeLast();

        // Skip the current number and move to the next
        findCombinations(result, currentCombination, currentSum, start + 1, targetSum, totalNumbers);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int minimalSum = 0;
        for (int i = 1; i <= k; i++) {
            minimalSum += i;
        }

        if (n < minimalSum) {
            return Collections.emptyList();
        }

        List<List<Integer>> combinations = new ArrayList<>();
        findCombinations(combinations, new ArrayList<>(), 0, 1, n, k);

        return combinations;
    }
}
