package medium;

import java.util.Hashtable;

/*
12. Integer to Roman
Link: https://leetcode.com/problems/integer-to-roman/

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.



Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= num <= 3999
*/
public class IntegerToRoman {
    public static void main(String[] args) {
        IntegerToRoman roman = new IntegerToRoman();
        String result = roman.intToRoman(3);
        System.out.println("Result is: " + result);
    }

    Hashtable<Integer, String> pair = new Hashtable();



    public String intToRoman(int num) {
        //At first, I want to create hashtable, which represents keys as number values and values as symbols
        pair.put(1,"I");
        pair.put(5, "V");
        pair.put(10, "X");
        pair.put(50, "L");
        pair.put(100, "C");
        pair.put(500, "D");
        pair.put(1000, "M");


        //ones, tens, hundreds and thousands should be detected.
        //it can be detected by using '%' sign, if it's '15' number, then 15 % 10 is 5;
        //probably it can be recursive function. We have to come to the minimum or most simple value;

        //E.g.: 15 should be divided in numbers 10 and 5; Than we know that, 10 is X and 5 is V. And 15 will be XV.
        //Note!: Everything can be divided by 5, except 1;

        //we don't have to check number for zero, because it's guaranteed that number range is 1 - 3999
        int divider = 1000;

//        String word =

        return "";
    }


//    private String detector(int number, int divider) {
////        int divider = 1000;
//
//        if (number % divider > 9) {
//
//        } else {
//            if ()
//        }
//    }


}
