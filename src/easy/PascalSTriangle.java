package easy;
/*
118. Pascal's Triangle
Link: https://leetcode.com/problems/pascals-triangle/


Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/

import java.util.ArrayList;
import java.util.List;

public class PascalSTriangle {


    public static void main(String[] args) {
        PascalSTriangle triangle = new PascalSTriangle();
        List<List<Integer>> array = triangle.generate(5);


        for (List<Integer> a : array) {
            for (Integer i : a) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        if (numRows == 1) return triangle;

        int sizeCounter = 2;
        for (int i = 1; i < numRows; i++) {
            triangle.add(new ArrayList<>());
            for (int j = 0; j < sizeCounter; j++) {
                if (j == 0 || j == sizeCounter - 1) triangle.get(i).add(1);
                else triangle.get(i).add(triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j-1));
            }
            sizeCounter++;
        }
        return triangle;
    }

}
