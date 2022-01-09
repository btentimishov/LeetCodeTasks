package easy;

import java.util.Arrays;
/*
344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.

*/
public class ReverseString344 {


    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};


        ReverseString344 reverseString344 = new ReverseString344();
        reverseString344.reverseString(chars);
    }


    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        int mid = (start + end + 2) / 2;

        for (int i = 0; i < mid; i++) {
            swap(s, i, end);
            end--;
        }
        System.out.println(Arrays.toString(s));
    }

    public void swap(char[] nums, int a, int b) {
        char n = nums[a];
        nums[a] = nums[b];
        nums[b] = n;
    }
}
