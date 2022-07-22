package easy;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs1512 {
    Map<Integer, BigInteger> combs = new HashMap<>();


    public static void main(String[] args) {
        NumberOfGoodPairs1512 n = new NumberOfGoodPairs1512();


//        System.out.println(n.calculateCombinationsBy2In(4));
        int[] array = {2, 2, 1, 5, 1, 5, 5, 2, 3, 1, 1, 5, 3, 2, 3, 3, 3, 1, 3, 3, 4, 3, 1, 3, 1, 4, 5, 5, 2, 2, 1, 3, 5, 2, 2, 4, 3, 2, 5, 3, 1, 1, 3, 3, 2, 5, 2, 1, 2, 4, 3, 4, 4, 3, 2, 4, 4, 1, 3, 3, 3, 5, 5, 5, 4, 1, 1, 2, 3, 3, 2, 5, 3, 4, 5, 3, 1, 2, 5, 4, 5, 2, 3, 3, 1, 5, 2, 4, 2, 4, 4, 3, 1, 3};
//        int[] array = {1,1,1,1};
        System.out.println(n.numIdenticalPairs(array));
    }

    public int numIdenticalPairs(int[] nums) {
        int result = 0;

        int[] map = new int[128];
        Map<Integer, Integer> memo = new HashMap<>();

        for (int num : nums) {
            map[num]++;
        }

        for (int i : map) {
            if (i >= 2) {

                if (memo.containsKey(i)) {
                    result += memo.get(i);
                } else {
                    int combinations = calculateCombinationsBy2In(i);
                    memo.put(i, combinations);

                    result += combinations;
                }
            }
        }

        return result;

    }
/*
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }*/


    public int calculateCombinationsBy2In(int amount) {
        BigInteger n;
        if (combs.containsKey(amount)) {
            n = combs.get(amount);
        } else {
            n = factorial(amount);
            combs.put(amount, n);
        }

        BigInteger nMinus2;
        if (combs.containsKey(amount - 2)) {
            nMinus2 = combs.get(amount - 2);
        } else {
            nMinus2 = factorial(amount - 2);
            combs.put(amount -2, nMinus2);

        }

        return n.divide((new BigInteger("2").multiply(nMinus2))).intValue();
    }


    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }


}
