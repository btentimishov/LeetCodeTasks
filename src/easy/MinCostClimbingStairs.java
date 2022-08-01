package easy;

import java.util.Arrays;
import java.util.List;

/*
746. Min Cost Climbing Stairs
Link: https://leetcode.com/problems/min-cost-climbing-stairs/

You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.



Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.


Constraints:

2 <= cost.length <= 1000
0 <= cost[i] <= 999
*/
public class MinCostClimbingStairs {
    public static void main(String[] args) {

        int i, j, k;

        i = j = k = 9;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
//        MinCostClimbingStairs stairs = new MinCostClimbingStairs();
//        int[] arr1 = {10, 15, 20};
//        int[] arr2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//        int[] arr3 = {2, 5, 3, 1, 7, 3, 4};
//        int[] arr4 = {16, 19, 10, 12, 18};
//        System.out.println(stairs.minCostClimbingStairs(arr1));
//        System.out.println(stairs.minCostClimbingStairs(arr2));
//        System.out.println(stairs.minCostClimbingStairs(arr3));
//        System.out.println(stairs.minCostClimbingStairs(arr4));
    }
    private List<String> test() {
        String[] arr = new String[12];

        return Arrays.asList(arr);
    }
    public int minCostClimbingStairs(int[] cost) {
//        int paid = 0;
//
//        paid = recursiveMinCost(cost, 0);
//        for (int i = 0; i < cost.length - 1; i++) {
//            if (i == cost.length - 1 || i == cost.length - 2) {
//                paid += cost[i];
//                System.out.println("Paid in i: " + i + " with cost: " + cost[i]);
//                break;
//            }
//
//            if (i == 0) {
//                if (cost[0] + cost[2] > cost[1]) {
//                    continue;
//                }
//            }
//
//            System.out.println("Paid in i: " + i + " with cost: " + cost[i]);
//            paid += cost[i];
//            if (cost[i + 1] > cost[i + 2]) {
//                i++;
//            }
//
//        }
        return minCostClimbingStairs2(cost);
//        return paid;
    }


    int recursiveMinCost(int[] cost, int index) {
        int paid = 0;

        if (index == cost.length - 1 || index == cost.length - 2) {
            paid += cost[index];
            return paid;
        }
//        if (index == 0) {
//            if (cost[0] + cost[2] > cost[1]) {
//                paid = recursiveMinCost(cost, ++index);
//            }
//        }

        if (cost[index] + cost[index + 2] > cost[index + 1]) {
            paid = recursiveMinCost(cost, ++index);
        }
//
//        for (int i = 0; i < cost.length - 1; i++) {
//            if (i == cost.length - 1 || i == cost.length - 2) {
//                paid += cost[i];
//                System.out.println("Paid in i: " + i + " with cost: " + cost[i]);
//                break;
//            }
//
//            if (i == 0) {
//                if (cost[0] + cost[2] > cost[1]) {
//                    continue;
//                }
//            }
//
//            System.out.println("Paid in i: " + i + " with cost: " + cost[i]);
//            paid += cost[i];
//            if (cost[i + 1] > cost[i + 2]) {
//                i++;
//            }
//
//        }

        return paid;

    }

    public int minCostClimbingStairs2(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        for(int i = 2; i <= n; i++){
            System.out.println();
            System.out.println("##########################");

            System.out.println("Cost array: " + Arrays.toString(cost));
            System.out.println("DP array: " + Arrays.toString(dp));
            System.out.println();
            int cost1 = dp[i-1] + cost[i-1];
            System.out.println("Dp1: " + dp[i-1] + " | Cost: " + cost[i-1] + " | Sum: " + cost1);
            int cost2 = dp[i-2] + cost[i-2];
            System.out.println("Dp1: " + dp[i-2] + " | Cost: " + cost[i-2] + " | Sum: " + cost2);
            System.out.println();
            dp[i] = Math.min(cost1, cost2);
            System.out.println("Cost array: " + Arrays.toString(cost));
            System.out.println("DP array: " + Arrays.toString(dp));
            System.out.println("Math min: " + dp[i]);
            System.out.println("##########################");
            System.out.println();
        }
        return dp[n];
    }



}
