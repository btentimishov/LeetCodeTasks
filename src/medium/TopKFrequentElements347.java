package medium;

import java.util.*;

public class TopKFrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, List<Integer>> tempMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getValue();

            pq.add(key);

            List<Integer> list = map.containsKey(key) ? tempMap.get(key) : new ArrayList<>();

            tempMap.put(key, list);
        }


        int[] result = new int[k];
        while (k > 0) {
            if (pq.size() > 0) {
                int key = pq.poll();
                List<Integer> temp = tempMap.get(key);

                for (int val: temp) {
                    result[k - 1] = val;
                    k--;
                    if (k <= 0) break;
                }
            } else {
                break;
            }
        }

        return result;
    }
}

