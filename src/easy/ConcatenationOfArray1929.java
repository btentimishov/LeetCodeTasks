package easy;

public class ConcatenationOfArray1929 {


    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        int numsSize = nums.length;

        System.arraycopy(nums, 0, result, 0, numsSize);


        System.arraycopy(nums, 0, result, numsSize, numsSize);


        return result;
    }
}
