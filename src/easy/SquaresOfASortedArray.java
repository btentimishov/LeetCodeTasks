package easy;


import java.lang.reflect.Array;
import java.util.Arrays;

/*
977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.


Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?

*/
public class SquaresOfASortedArray {

    public static void main(String[] args) {

        int[] numbers = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squaresOfASortedArray(numbers)));

    }

    public static int[] squaresOfASortedArray(int[] nums){
        //we know that array is sorted in non-decreasing order
        //we also know that if we square values less than zero it became a value greater than zero,
        //so it means that if we square for example number '-5' and '5' we will get the same result

        // [-4,-1,0,3,10]
        //we can change -4 to 4
        //we can change -1 to 1


        // we know that squared sign of negative and positive numbers is always positive.
        // we will iterate from both ends
        int start = 0;
        int end = nums.length - 1;
        int[] squaredArray = new int [nums.length];

        int i = nums.length -1;


        while (start <= end) {
            if (Math.abs(nums[start]) < Math.abs(nums[end])){
                squaredArray[i] = nums[end] * nums[end];
                end --;
            } else {
                squaredArray[i] = nums[start] * nums[start];
                start ++;
            }

            i--;
        }

        return squaredArray;

    }
}
