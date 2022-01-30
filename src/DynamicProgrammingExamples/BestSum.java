package DynamicProgrammingExamples;

import java.util.ArrayList;
import java.util.HashMap;

/*
m = target sum
n = numbers.length

Brute Force
time: O(n^m * m)
space: O(m^2)

Memoized
time: O(m^2 * n)
space: O(m^2)


*/
public class BestSum {

    public static void main(String[] args) {
        int[] arr2 = {5, 3,4,7};
        int[] arr3 = {2, 3, 5};
        int[] arr4 = {1, 4, 5};
        int[] arr5 = {1,2,5,25};
        BestSum bestSum = new BestSum();

        System.out.println(bestSum.sum(7, arr2, new HashMap<>())); // [7]
        System.out.println(bestSum.sum(8, arr3, new HashMap<>())); // [3, 5]
        System.out.println(bestSum.sum(8, arr4, new HashMap<>())); // [4, 4]
        System.out.println(bestSum.sum(100, arr5, new HashMap<>())); //[25, 25, 25, 25]
    }

    private ArrayList<Integer> bestSum(int targetSum, int[] numbers, HashMap<Integer, ArrayList<Integer>> memo) {

        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<Integer>();
        if (targetSum < 0) return null;

        ArrayList<Integer> shortestCombination = null;

        for (int i = 0; i < numbers.length; i++) {
            int remainder = targetSum - numbers[i];
            ArrayList<Integer> remainderCombination = bestSum(remainder, numbers, memo);
            if (remainderCombination != null) {


                remainderCombination.add(numbers[i]);

                if (shortestCombination == null || remainderCombination.size() < shortestCombination.size()) {
                    shortestCombination = new ArrayList<Integer>();
                    shortestCombination = (ArrayList<Integer>) remainderCombination.clone();
                }
            }
        }


        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }

    public ArrayList<Integer> sum (int targetSum, int[] numbers, HashMap<Integer, ArrayList<Integer>> memo) {
        if(memo.containsKey(targetSum)) return memo.get(targetSum);
        if(targetSum == 0) return new ArrayList<>();
        if(targetSum < 0) return null;


        ArrayList<Integer> shortestCombination = null;

        for(int i  = 0; i < numbers.length; i++) {
            int remainder = targetSum-numbers[i];
            ArrayList<Integer> remainderCombination = sum(remainder, numbers, memo);
            if(remainderCombination != null) {

                ArrayList<Integer> combination;
                combination = (ArrayList<Integer>)remainderCombination.clone();


                combination.add(numbers[i]);

                if(shortestCombination == null || combination.size() < shortestCombination.size()){
                    shortestCombination = (ArrayList<Integer>) combination.clone();
                }
            }
        }

        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }

}
