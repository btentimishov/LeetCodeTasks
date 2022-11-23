package medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

    public static void main(String[] args) {
        Subsets78 subsets78 = new Subsets78();

//        subsets78.subsets(new int[]{1,2,3});
        subsets78.recursion();

    }
    void recursion () {
        System.out.println("It's recursion");
        recursion();
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans, 0, nums, list);
        return ans;
    }


    public void helper(List<List<Integer>> ans, int start, int[] nums, List<Integer> list) {
        System.out.println("Start of function ################ ");
        System.out.println("Start: " + start);
        System.out.println("Result list: " + ans);
        System.out.println("Temp list: " + list);
        if (start >= nums.length) {
            ans.add(new ArrayList<>(list)); //In java, we will have to add like this otherwise it'll give null as it'll just have the reference instead of actual values.
            System.out.println();
            System.out.println("Adding to result list: " + ans + "\n");
        } else {
            //add the element and start the  recursive call
            list.add(nums[start]);
            System.out.println("Adding to temp list: " + nums[start] + "\n");
            helper(ans, start + 1, nums, list);
            //remove the element and do the backtracking call.

            System.out.println("Removing from temp list temp list: " + list.get(list.size() - 1));
            list.remove(list.size() - 1);
            helper(ans, start + 1, nums, list);
        }
        System.out.println("End of function ################ " + "\n");
    }
}
