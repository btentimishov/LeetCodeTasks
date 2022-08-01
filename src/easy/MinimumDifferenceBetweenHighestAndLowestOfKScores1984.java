package easy;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores1984 {

    public static void main(String[] args) {

    }


    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);


        int max = nums[0];
        int min = nums[0];

        for (int i : nums){
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }

        int difference = max - min;

        for (int i = 1; i <= nums.length + k; i++) {
            max = nums[i];
        }

        return difference;
    }
}
