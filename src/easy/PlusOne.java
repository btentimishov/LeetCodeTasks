package easy;

import java.util.Arrays;

public class PlusOne {


    public static void main(String[] args) {


        int[] a = {1, 2, 3};
        int[] b = {4, 3, 2, 1};
        int[] c = {9};
        int[] d = {9, 9, 9, 9};
        int[] e = {9, 9, 8, 9, 9, 9, 9};
        int[] f = {9, 9, 9, 7, 8, 9};


        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(a))); // 124
        System.out.println(Arrays.toString(plusOne.plusOne(b))); // 4322
        System.out.println(Arrays.toString(plusOne.plusOne(c))); // 10
        System.out.println(Arrays.toString(plusOne.plusOne(d))); // 10000
        System.out.println(Arrays.toString(plusOne.plusOne(e))); // 9990000
        System.out.println(Arrays.toString(plusOne.plusOne(f))); // 999790


    }


    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } else {
            return digits;
        }

    }
}
