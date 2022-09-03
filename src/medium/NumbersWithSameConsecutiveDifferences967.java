package medium;

import java.util.ArrayList;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences967 {
    public static void main(String[] args) {
        System.out.println(Math.abs( 5 - 6));
        System.out.println(Math.abs( 6 - 5));

    }

    public int[] numsSameConsecDiff(int n, int k) {

        int big = makeBig(n);
        List<Integer> result = new ArrayList<>();
        int toCompare = big / 10;
        while(big > toCompare) {

            if (checkNumber(big, k)) {
                result.add(big);
            }

            big--;
        }

        return convertIntegers(result);
    }


    boolean checkNumber(int num, int k) {

        int a = num % 10;
        num /= 10;

        while(num > 0) {

            int b = num % 10;
            num /= 10;
            if (Math.abs(a - b) != k) return false;

            a = b;
        }

        return true;

    }

    public static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++) {
            ret[i] = integers.get(i);
        }
        return ret;
    }

    int makeBig(int n) {
        int num = 1;
        while (n > 0) {
            num *= 10;
            n--;
        }

        return num - 1;
    }
}
