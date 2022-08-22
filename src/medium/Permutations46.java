package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length == 1) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            result.add(temp);
            return result;
        }



        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                List<Integer> temp = new ArrayList<>();
                for (int num : nums) {
                    temp.add(num);
                }
                result.add(temp);
                swap(j, j + 1, nums);
            }

        }

        return result;
    }

    void swap(int i1, int i2, int[] arr) {
        int a = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = a;
    }

}
