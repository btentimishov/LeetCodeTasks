package easy;

import java.util.Arrays;

/*
167. Two Sum II - Input Array Is Sorted

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.*/
public class TwoSumIIInputArrayIsSorted {


    public static void main(String[] args) {

        int[] numbers = {-1,0};
        int target = -1;

        TwoSumIIInputArrayIsSorted a = new TwoSumIIInputArrayIsSorted();
        a.twoSum(numbers, target);
    }


    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2 ) return null;

        //we should create array that holds 2 indices that sum up as target
        int[] indices = new int[2];


        // let's iterate the whole array
        // the value being taken from array should be less or equal than target
        // if first value is less than target, second value should be equal target-firstValue

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= target) {
                int firstValue = numbers[i];

                for (int j = i + 1; j < numbers.length; j++) {
                    if (firstValue+numbers[j] == target) {
                        indices[0] = i + 1;
                        indices[1] = j + 1;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(indices));
        return indices;

    }
}
