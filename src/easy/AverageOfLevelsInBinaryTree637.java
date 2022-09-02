package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageOfLevelsInBinaryTree637 {


    public List<Double> averageOfLevels(TreeNode root) {

        Map<Integer, List<Double>> map = new HashMap<>();
        helper(root, map, 0);
        int key = 0;

        List<Double> result = new ArrayList<>();


        while (map.containsKey(key)) {
            double sum = 0;
            for (Double temp : map.get(key)) {
                sum += temp;
            }
            result.add(sum / map.get(key).size());
            key++;
        }
        return result;

    }

    void helper(TreeNode root, Map<Integer, List<Double>> map, int key) {
        if (root == null) return;

        List<Double> result = map.getOrDefault(key, new ArrayList<>());
        result.add((double) root.val);

        map.put(key, result);


        helper(root.left, map, key + 1);

        helper(root.right, map, key + 1);


    }
}