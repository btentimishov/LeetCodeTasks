package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII229 {

    public static void main(String[] args) {
        MajorityElementII229 m = new MajorityElementII229();

        System.out.println(m.majorityElement(new int[]{3, 2, 3}));
        System.out.println(m.majorityElement(new int[]{1}));
        System.out.println(m.majorityElement(new int[]{1, 2}));
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }

        int majoritySize = nums.length / 3;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int value = map.getOrDefault(num, 0);

            if (value == -1) continue;

            if (value + 1 > majoritySize) {
                list.add(num);
                map.put(num, -1);
                continue;
            }

            map.put(num, value + 1);
        }

        return list;


    }

}
