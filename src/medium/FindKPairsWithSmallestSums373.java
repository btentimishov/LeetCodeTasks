package medium;

import java.util.*;

public class FindKPairsWithSmallestSums373 {

    public static void main(String[] args) {
        FindKPairsWithSmallestSums373 find = new FindKPairsWithSmallestSums373();

        //[1,1,2], [1,2,3], 10
        System.out.println(find.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 10));

        System.out.println("Expected: [[1,1],[1,1],[2,1],[1,2],[1,2],[2,2],[1,3],[1,3],[2,3]]");
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, List<List<Integer>>> map = new HashMap<>();

        List<List<Integer>> result = new ArrayList<>();


        for (int num1 : nums1) {
            for (int num2 : nums2) {
                System.out.println("Pair: " + num1 + " : " + num2);
                int sum = num1 + num2;
                pq.add(sum);

                List<List<Integer>> values = map.containsKey(sum) ? map.get(sum) : new ArrayList<>();

                List<Integer> value = new ArrayList<>();
                value.add(num1);
                value.add(num2);
                values.add(value);
                map.put(sum, values);
            }
        }

        System.out.println("Priority queue: " + pq);
        System.out.println("Hash Map: " + map);
        while (k > 0 && pq.size() > 0) {


            Integer key = pq.poll();

            if (map.containsKey(key)) {

                List<List<Integer>> values = map.get(key);
                for (List<Integer> value : values) {
                    result.add(value);
                    k--;
                    if (k == 0) break;
                }
                map.remove(key);
            }
        }


        return result;

    }


    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;


        if (head.val != head.next.val) {
            head.next = deleteDuplicates(head.next);
            return head;
        }


        int cur = head.val;
        while (head != null) {
            if (head.val != cur) break;

            head = head.next;
        }
        return deleteDuplicates(head);

    }


    public int minPathSum(int[][] grid) {
        return minPathSumMemo(grid,0, 0, new HashMap<>());
    }


    public int minPathSumMemo(int[][] grid, int i, int j, HashMap<String, Integer> memo) {

        if (i == grid.length - 1 && j == grid[i].length - 1 ) return grid[i][j];


        if (i == grid.length - 1 ) return grid[i][j] + minPathSumMemo(grid, i, j + 1, memo);
        if (j == grid[i].length - 1 ) return grid[i][j] + minPathSumMemo(grid, i + 1, j, memo);


        String key = i + ":" + j;
        if (memo.containsKey(key)) return memo.get(key);

        int one = minPathSumMemo(grid, i + 1, j, memo);
        int two = minPathSumMemo(grid, i, j + 1, memo);

        memo.put(key, grid[i][j] + Math.min(one, two));

        return memo.get(key);
    }


}
