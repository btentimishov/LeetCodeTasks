package medium;

import java.util.ArrayList;
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
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        zigzagConversion.convert("PAYPALISHIRING", 3);
    }

    public String convert(String s, int numRows) {
        return helper(s, numRows);
    }

/*    public String helper(String s, int numRows) {
        if (s.length() < 3) return s;

        int counter = 0;
        List<List<String>> matrics = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            if (counter % numRows - 1 == 0) {

                for (int j = 0; j < numRows; j++) {
                    matrics.get(i).set(j, Character.toString(s.charAt(++j)));
                }
            } else {

            }

            while (counter != s.length()) {
                counter ++;
            }

        }


        }
        return "";

    }*/

    public String helper(String s, int numRows) {
        if (s.length() < 3) return s;
        char[] array = s.toCharArray();
        int size = s.length();
        int iRow = 0;
        int iColumn = 0;
        int counter = 0;

        ArrayList<ArrayList<String>> table = new ArrayList<>(numRows);
        for (ArrayList<String> o :
                table) {
            o = new ArrayList<>();
        }


        while (counter < size) {


            int a= size - 1;

            if (iRow == 0 && iColumn % a == 0) {

                //iterate vertical down
                for (int i = 0; i < numRows; i++) {
                    table.get(i).add("");
                    System.out.println("iRow: " + iRow + ", iColumn: " + iColumn);
                    table.get(i).set(iColumn, Character.toString(array[counter]));

                    iRow++;
                    counter++;
                }

                iColumn++;
            } else if (iRow == size-1 && iColumn % size-1 != 0) {
                //iterate diagonally up
                for (int i = 0; i < size - 2; i++) {
                    iRow--;
                    iColumn--;
                    table.get(iRow).set(iColumn, Character.toString(array[counter]));
                    counter++;
                }

            } else {
                counter++;

            }

            for (ArrayList<String> o : table) {
                for (String hi :
                        o) {
                    System.out.print(hi);

                }
                System.out.println();
            }
        }

        return "";







      /*  int counter = 0;
        List<List<String>> matrics = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            if (counter % numRows - 1 == 0) {

                for (int j = 0; j < numRows; j++) {
                    matrics.get(i).set(j, Character.toString(s.charAt(++j)));
                }
            } else {

            }

            while (counter != s.length()) {
                counter++;
            }

        }

        return "";
*/
    }

}

