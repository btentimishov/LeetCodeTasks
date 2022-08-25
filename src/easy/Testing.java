package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 4};

        System.out.println("Array 1: " + Arrays.toString(arr1));

        int[] arr2 = arr1;
        System.out.println("Array 2: " + Arrays.toString(arr2));
        arr2[1] = 3;
        System.out.println("After update: ");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

    }


    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        int length = 0;
        long temp = 1;
        do {
            length++;
            temp *= 10;
        } while (temp <= x);

        int rightHalf = 0;
        for (int i = 0; i < length / 2; i++) {
            rightHalf = rightHalf * 10 + x % 10;
            x /= 10;
        }

        if (length % 2 == 1) x /= 10;

        return x == rightHalf;
    }


    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            int a = nums[i];

            if (i != 0) if (a == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                int b = nums[j];
                int left = j + 1; // first pointer to check from left, it's i + 1 so
                int right = nums.length - 1; // second pointer to check from right


                while (left < right) {
                    int sum = nums[left] + nums[right] + a + b;
                    if (sum > target) right--;
                    else if (sum < target) left++;
                    else {
                        result.add(Arrays.asList(a, b, nums[left], nums[right]));
                        right--;
                        left++;
                    }
                }
            }
        }

        return result;
    }



    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();



        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sb.append(num);

            int temp = num;

            while (nums[i+1] - 1 == nums[i] && i < nums.length - 1) {
                temp = nums[i];
                i++;
            }

            if (num != temp) {
                sb.append("->").append(nums[i]);
            }

            result.add(sb.toString());

            sb = new StringBuilder();
        }


        return result;
    }
}
