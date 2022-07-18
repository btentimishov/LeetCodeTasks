package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int leftNum = target - nums[i];
            if (map.containsKey(leftNum)) {
                int j = map.get(leftNum);
                return new int[]{i, j};
            } else map.put(nums[i], i);
        }

        return new int[2];
/*            if (nums[i] > target) continue;

            for (int f = i + 1; f < nums.length; f++) {
                if (nums[f] > target) continue;
                if (map.containsKey(i + "." + f)) continue;

                int sum = nums[i] + nums[f];
                if (target == sum) {
                    int[] array = new int[2];
                    array[0] = i;
                    array[1] = f;
                    return array;
                } else {
                    map.put(i + "." + f, sum);
                    map.put(f + "." + i, sum);
                }
            }*/
    }
}
