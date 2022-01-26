package DynamicProgrammingExamples;

import java.security.KeyPair;
import java.util.HashMap;

public class CanSum {
    public static void main(String[] args) {
        CanSum canSum = new CanSum();

        int[] arr1 = {2, 3};
        int[] arr2 = {5, 3,4,7};
        int[] arr3 = {2, 4};
        int[] arr4 = {2, 3, 5};
        int[] arr5 = {7,14};
        System.out.println(canSum.canSum(7, arr1, new HashMap<>()));
        System.out.println(canSum.canSum(7, arr2, new HashMap<>()));
        System.out.println(canSum.canSum(7, arr3, new HashMap<>()));
        System.out.println(canSum.canSum(8, arr4, new HashMap<>()));
        System.out.println(canSum.canSum(300, arr5, new HashMap<>()));
    }

    private boolean canSum(int targetSum, int[] numbers, HashMap<Integer, Boolean> pair) {
        if (pair == null) pair = new HashMap<>();
        if (pair.containsKey(targetSum)) return pair.get(targetSum);
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (int i = 0; i < numbers.length; i++) {
            int remainder = targetSum - numbers[i];

            boolean canSum = canSum(remainder, numbers, pair);
            if (canSum) {
                pair.put(targetSum, true);
                return true;
            }
        }
        pair.put(targetSum, false);
        return false;
    }
}
