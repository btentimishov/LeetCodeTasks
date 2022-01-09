package easy;

import java.util.Arrays;

public class test {


    public String longestCommonPrefix(String[] strs)
    {
        int size = strs.length;

        if (size == 0) return "";
        if (size == 1) return strs[0];

        Arrays.sort(strs);

        int end = Math.min(strs[0].length(), strs[size-1].length());

        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[size-1].charAt(i) )
            i++;

        String pre = strs[0].substring(0, i);
        return pre;
    }

    /* Driver Function to test other function */
    public static void main(String[] args)
    {
//        test gfg = new test();*/


        int n = (1 + ((10-1)/2));
        System.out.println(n);
//        String[] input = {"abf", "abcdef", "abcd", "abcf"};
//        System.out.println( "The longest Common Prefix is : " +
//                gfg.longestCommonPrefix(input));
    }
}
