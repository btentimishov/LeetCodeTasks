package easy;
/*
35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

*/
public class SearchInsertPosition {

    public static void main(String[] args) {
        int [] nums = {1,3,5,6};

        System.out.println("Target 5: " + searchInsert(nums, 5));
        System.out.println("Target 2: " + searchInsert(nums, 2));
        System.out.println("Target 7: " + searchInsert(nums, 7));
        System.out.println("Target 0: " + searchInsert(nums, 0));

    }

    public static int searchInsert(int[] nums, int target) {

        //'start' index of an array to be searched, it will change if it's needed
        int start = 0;
        //'end' index of an array to be searched, it will change if it's needed
        int end = nums.length  - 1;

        //'mid' index of an array to be usually compared with target value, it will change until we find the needed index
        int mid = start + ((end - start) / 2);

        //we run while loop until 'start' index is less than 'end' index
        while (start <= end) {
            if (target == nums[mid]){
                //if value of array with index 'mid' is equal to target value we should return 'mid' index as an index of a searched value
                return mid;
            } else if (target > nums[mid]) {
                // if target value is greater than value of array with index 'mid' then we adjust start index to mid + 1; because we don't need that part of array before index mid, with index mid included.
                start = mid + 1;
            } else if (target < nums[mid]) {
                // if target value is greater than value of array with index 'mid' then we adjust end index to mid -1 ; because we don't need that part of array after index mid, with index mid included.
                end = mid - 1;
            }
            // here we make a new value for 'mid' index so to calculate new 'mid' index for a new half array of previous one
            mid = start + ((end - start) / 2);
        }
        return start;
    }
}
