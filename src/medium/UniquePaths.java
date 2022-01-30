package medium;

import java.util.HashMap;

/*
62. Unique Paths
Link: https://leetcode.com/problems/unique-paths/

There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.
*/
public class UniquePaths {

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println("Paths:  " + uniquePaths.uniquePaths(3, 2));
    }

    public int uniquePaths(int m, int n) {
        HashMap<String, Integer> memo = new HashMap<>();

        return findUniquePaths(m, n, null);
    }

    private Integer findUniquePaths(int m, int n, HashMap<String, Integer> memo) {

        if (memo == null) memo = new HashMap<>();
        String key = m + "," + n;
        if (memo.containsKey(key)) return memo.get(key);
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;

        memo.put(key, Integer.sum(findUniquePaths(m - 1, n, memo), findUniquePaths(m, n - 1, memo)));
        return memo.get(key);
    }

}
