package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
6. Zigzag Conversion
Link: https://leetcode.com/problems/zigzag-conversion/
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
*/
public class ZigzagConversion {

    public static void main(String[] args) {
        int n = 1;
        int a = -4;

        n = -a;
        System.out.println(n);
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        System.out.println(zigzagConversion.convert("PAYPALISHIRING", 4));
    }

    public String convert(String s, int numRows) {
        if(s.length() == 1 || s.length() == 2 || numRows == 1) return s;

        String[] strings = new String[numRows];

        int k = 0;
        boolean goDown = true;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            StringBuilder builder = new StringBuilder();
            if (strings[k] != null) {
                builder.append(strings[k]);
            }

            builder.append(c);
            strings[k] = builder.toString();


            if (k == numRows - 1) {
                goDown = false;
            } else if (k == 0) {
                goDown = true;
            }

            if (goDown) k++;
            else k--;
            i++;
        }


        StringBuilder builder = new StringBuilder();


        for (String str :
                strings) {
            if (str != null) {
                builder.append(str);
            }
        }
        return builder.toString();

    }


//    public String convert(String s, int numRows) {
//        List<List<Character>> list = new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//
//
//        }
//
//    }

}

