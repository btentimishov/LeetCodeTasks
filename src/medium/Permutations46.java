package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        Permutations46 permutations46 = new Permutations46();

        System.out.println(permutations46.permute(new int[] {1,2,3}));
    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        permute(result, new ArrayList<>(), nums);

        return result;

    }


    public void permute(List<List<Integer>> list, List<Integer> tempList, int[] nums) {

        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                if (tempList.contains(num)) continue;
                tempList.add(num);
                permute(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
