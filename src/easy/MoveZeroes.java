package easy;

import java.util.Arrays;

/*

283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?  */
public class MoveZeroes {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 0, 0};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(numbers);
    }

    public void moveZeroes(int[] nums) {
        //we can iterate it over whole array
        if (nums.length < 2) return;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i < nums.length - 1) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            swap(nums, i, j);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }


    public void swap(int[] nums, int a, int b) {
        int n = nums[a];


        nums[a] = nums[b];
        nums[b] = n;

    }

}
