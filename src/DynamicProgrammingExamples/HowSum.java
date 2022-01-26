package DynamicProgrammingExamples;

import java.util.ArrayList;
import java.util.HashMap;
/*
m = target sum
n = numbers.length

Brute Force
time: O(n^m * m)
space: O(m)

Memoized
time: O(n*m^2)
space: O(m^2)


*/
public class HowSum {


    public static void main(String[] args) {
        int[] arr1 = {2, 3};
        int[] arr2 = {5, 3,4,7};
        int[] arr3 = {2, 4};
        int[] arr4 = {2, 3, 5};
        int[] arr5 = {7,14};
        HowSum howSum = new HowSum();
        System.out.println(howSum.howSum(7, arr1, new HashMap<>()));
        System.out.println(howSum.howSum(7, arr2, new HashMap<>()));
        System.out.println(howSum.howSum(7, arr3, new HashMap<>()));
        System.out.println(howSum.howSum(8, arr4, new HashMap<>()));
        System.out.println(howSum.howSum(300, arr5, new HashMap<>()));
    }


    private ArrayList<Integer> howSum(int targetSum, int[] numbers, HashMap<Integer, ArrayList<Integer>> memo){

        if (memo == null) memo = new HashMap<>();

        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (int i = 0; i < numbers.length; i++) {
            int remainder = targetSum - numbers[i];
            ArrayList<Integer> remainderResult = howSum(remainder, numbers, memo);

            if (remainderResult != null) {
                remainderResult.add(numbers[i]);
                memo.put(targetSum, remainderResult);
                return memo.get(targetSum);
            }
        }
        memo.put(targetSum, null);
        return null;
    }

}
