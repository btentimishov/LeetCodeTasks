package hard;

import java.util.Arrays;

/*
4. Median of Two Sorted Arrays
Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        MedianOfTwoSortedArrays motsa = new MedianOfTwoSortedArrays();
        int[] n1 = {1};
        int[] n2 = {2, 3, 4};
        double median = motsa.findMedianSortedArrays(n1, n2);

        System.out.println("Median: " + median);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        //first idea is to make one array from two arrays
        int[] newArray;
        //next step is to add values to this array from other two
        //it should be sorted, so we can find median without problem
        if (nums1.length == 0) {
            newArray = nums2;
        } else if (nums2.length == 0) {
            newArray = nums1;
        } else {
            newArray= new int[n+m];
            int k1 = 0;
            int k2 = 0;
            for (int i = 0; i < newArray.length; i++) {
                if (k1 >= nums1.length) {
                    newArray[i] = nums2[k2];
                    k2++;
                    continue;
                }
                if (k2 >= nums2.length) {
                    newArray[i] = nums1[k1];
                    k1++;
                    continue;
                }
                if (nums1[k1] <= nums2[k2]) {
                    newArray[i] = nums1[k1];
                    k1++;
                } else {
                    newArray[i] = nums2[k2];
                    k2++;
                }
            }
        }


//        System.out.println("New array: " + Arrays.toString(newArray));
        int midIndex = (newArray.length -1) / 2;
        double mid = newArray.length % 2 == 0 ? (newArray[midIndex] + newArray[midIndex + 1]) / 2.0 : newArray[midIndex];
        return mid;
        //O(log(m+n)) can be achieved with binary search if array is sorted

        //but the question is what we are searching

        //it's not clear what should be median if arrays look like this below
        // [1,2,3,4,5,6,7,8,9]
        // [11,12,13,14,15,16,17,19,20]
}

}
