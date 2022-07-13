package easy;

public class BinarySearch704 {
    public static void main(String[] args) {
        BinarySearch704 b = new BinarySearch704();


        int[] arr1 = {-1,0,3,5,9,12};
        b.search(arr1, 9);
        b.search(arr1, 2);

    }
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (target < nums[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
