package medium;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
15. 3Sum
Link: https://leetcode.com/problems/3sum/

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
*/
public class ThreeSum3Sum {

    public static void main(String[] args) {
        ThreeSum3Sum threeSum = new ThreeSum3Sum();

        int[] nums = {0,0,0};


//        int[] nums = {};
        List<List<Integer>> listOfLists = threeSum.threeSum(nums);
        System.out.println("Final result is: " + listOfLists.toString());
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfLists = new ArrayList<>();


        int a = -1, b =-1, c =-1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) break;
                for (int k = 0; k < nums.length; k++) {
                    if (k == j || k == i) break;
                    if (nums[i] + nums[j] + nums[k] == 0) {


                        if (a != -1 || b!=-1 || c!= -1){
                        int[] real = {nums[i], nums[j], nums[k]};
                            int[] current = {nums[a], nums[b], nums[c]};

                            int[] test1 = {i, j, k};
                            int[] test2 = {a, b, c};
                            if (Arrays.equals(sortArray(real), sortArray(current)) && Arrays.equals(sortArray(test1), sortArray(test2))) {
                                System.out.println(Arrays.toString(real));
                                System.out.println(Arrays.toString(current));
                                break;
                            }
                        }


                        List list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        listOfLists.add(list);

                        a = i;
                        b = j;
                        c = k;
                        break;
                    }
                }
            }

        }
        return listOfLists;
    }

    int[] sortArray(int[] array){
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array [j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

}
