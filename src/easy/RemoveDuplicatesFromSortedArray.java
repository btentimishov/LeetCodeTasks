package easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                n--;
            } else {
                j++;
                nums[j] = nums[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1,1,2};
        int n = removeDuplicates(nums);

        System.out.println("Number is: " + n);
        System.out.println(Arrays.toString(nums));

    }

}
