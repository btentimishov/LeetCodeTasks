package medium;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray34 {
    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray34 f = new FindFirstAndLastPositionOfElementInSortedArray34();

        System.out.println(Arrays.toString(f.searchRange(new int[]{8, 8, 8, 8, 8, 8}, 8)));
        System.out.println(Arrays.toString(f.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }


    public int[] searchRange(int[] nums, int target) {

        //Base cases
        if (nums.length == 0) return new int[]{-1, -1};


//
//        if (nums.length == 1)  {
//            if(target == nums[0]) return new int[]{0, 0};
//            return new int[] {-1, -1};
//        }


        int binaryIndex = Arrays.binarySearch(nums, target);
        //if binary search haven't found anything then there is no match to target
        if (binaryIndex < 0) return new int[]{-1, -1};

        //initialised variables to track first and last index
        //and assigned to binary index by default in case there is only one match to target
        int firstIndex = binaryIndex;
        int lastIndex = binaryIndex;

        //here goes first loop to the left
        int k = firstIndex - 1;
        while (k >= 0) {
            if (nums[k] == target) firstIndex = k;
            else break;
            k--;
        }


        //here goes second loop to the right
        int i = lastIndex;
        while (i < nums.length) {
            if (nums[i] == target) {
                lastIndex = i;
            } else break;
            i++;
        }

        return new int[]{firstIndex, lastIndex};
    }
}
