package medium;

import java.util.Arrays;
/*
7. Reverse Integer
Link: https://leetcode.com/problems/reverse-integer/


Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1
*/
public class ReverseInteger {


    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
//        System.out.println(reverseInteger.calcPower(3, 3));
//        System.out.println(reverseInteger.makeTen(5));
//        System.out.println(Arrays.toString(reverseInteger.makeTens(5)));


        System.out.println(reverseInteger.reverse(1056389759)); // 321
//        System.out.println(reverseInteger.reverse(-6789012)); // -321
//        System.out.println(reverseInteger.reverse(120)); // 21
    }

    public int reverse(int x) {

        if (x < 10 && x > -10) return x;
        boolean isNegative = x < 0;
        if (isNegative) x *= -1;

        int digits = 0;
        int nCopy = x;
        while (nCopy > 0) {
            nCopy /= 10;
            digits++;
        }

        int[] digitArray = new int[digits];
        int[] arrayTab = makeTens(digits);
        for (int i = 0; i < digits; i++) {
            digitArray[i] = x % 10;
            x /= 10;
        }
//        System.out.println(Arrays.toString(digitArray));
        long newNumber = 0;
        for (int i = 0; i < digitArray.length; i++) {
            newNumber += (long) digitArray[i] * arrayTab[digits -i -1];
        }

        if ((newNumber > 2147483647) || (newNumber < -2147483648)) return 0;
        if (isNegative) newNumber  *= -1;


        return (int) newNumber;
    }

    int[] makeTens(int tens) {
        int[] array = new int[tens];
        int number = 1;
        for (int i = 0; i < tens; i++) {
            array[i] = number;
            number *= 10;
        }
        return array;
    }


    int makeTen(int tens) {
        int number = 1;

        for (int i = 0; i < tens; i++) {
            number *= 10;
        }
        return number;
    }


    int calcPower(int number, int power) {
        int newNumber = number;
        for (int i = 1; i < power; i++) {
            newNumber *= number;
        }
        return newNumber;
    }


}
