package easy;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class MergeTwoSortedArray88 {

    public static void main(String[] args) {
        int[] a ={1,2,3,0,0,0};
        int[] b ={2,5,6};


        MergeTwoSortedArray88 m = new MergeTwoSortedArray88();
        m.merge(a, 3, b, 3);

        System.out.println(Arrays.toString(a));
    }



    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m + n == 0) return;

        int iLast = m + n - 1, i1 = m - 1, i2 = n - 1;

        while (iLast > 0) {
            int temp = 0;
            if (i1 < 0) {
                temp = nums2[i2];
                i2--;
            } else if (i2 < 0) {
                temp = nums1[i1];
                i1--;
            } else if (nums1[i1] > nums2[i2]) {
                temp = nums1[i1];
                i1--;
            } else if (nums1[i1] <= nums2[i2]) {
                temp = nums2[i2];
                i2--;
            }

            nums1[iLast] = temp;
            iLast--;
        }
    }
}
