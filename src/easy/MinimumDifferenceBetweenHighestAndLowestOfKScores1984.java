package easy;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores1984 {

    public static void main(String[] args) {
        MinimumDifferenceBetweenHighestAndLowestOfKScores1984 minimum = new MinimumDifferenceBetweenHighestAndLowestOfKScores1984();
        System.out.println(minimum.minimumDifference(new int[]{9, 4, 1, 7}, 2));

    }


    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);


        int min = nums[0];
        int max = nums[k - 1];

        int difference = max - min;

        for (int i = 1; i <= nums.length - k; i++) {
            min = nums[i];
            max = nums[(i + k) - 1];

            difference = Math.min(difference, max - min);
        }
        return difference;
    }
}
