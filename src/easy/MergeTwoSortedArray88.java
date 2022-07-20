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
        if (n == 0) return;


        int[] newArr = new int[n + m];


        int k1 = 0;
        int k2 = 0;

        for (int i = 0; i < newArr.length; i++) {
            int a = nums1[k1];
            int b = nums2[k2];

            if (a == 0) {
                newArr[i] = b;
                k1++;
                k2++;
                continue;
            }

            if (a > b) {
                newArr[i] = b;
                k2++;
            } else {
                newArr[i] = a;
                k1++;
            }
        }


        for (int i = 0; i < newArr.length; i++) {
            nums1[i] = newArr[i];
        }
//        nums1 = Arrays.copyOf(newArr, newArr.length);

//        System.out.println(Arrays.toString(nums1));
//        System.out.println(Arrays.toString(newArr));
/*        int k = 0;
        for (int i = 0; i < m; i++) {
            int a = nums1[i];
            int b = nums2[k];
            if (b < a) {
                nums1[i] = b;
                nums2[k] = a;
            }
        }
        k = m;
        for (int j : nums2) {
            nums1[k] = j;
            k++;
        }*/
    }
}
