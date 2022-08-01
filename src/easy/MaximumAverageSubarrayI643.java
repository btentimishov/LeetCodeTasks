package easy;

public class MaximumAverageSubarrayI643 {
    public static void main(String[] args) {
        MaximumAverageSubarrayI643 m = new MaximumAverageSubarrayI643();
        System.out.println(m.findMaxAverage(new int[] {0,4,0,3,2}, 1));
    }
    public double findMaxAverage(int[] nums, int k) {

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double maxAvg = (double) maxSum / k;

        for (int i = 1; i <= nums.length - k; i++) {
            int prev = nums[i - 1];
            int next = nums[i + k - 1];

            maxSum = (maxSum - prev) + next;
            maxAvg = Math.max(maxAvg, (double) maxSum / k);
        }

        return maxAvg;
    }
}
