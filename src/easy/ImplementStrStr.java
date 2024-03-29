package easy;

/*
28. Implement strStr()
Link: https://leetcode.com/problems/implement-strstr/

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().



Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:

Input: haystack = "", needle = ""
Output: 0


Constraints:

0 <= haystack.length, needle.length <= 5 * 104
haystack and needle consist of only lower-case English characters.
*/
public class ImplementStrStr {


    public static void main(String[] args) {
        ImplementStrStr implementStrStr = new ImplementStrStr();


        String hayStack = "aaa";
        String needle = "aaa";
        int index = implementStrStr.strStr(hayStack, needle);


        System.out.println("Index: " + index);
    }

    public int strStr(String haystack, String needle) {
        //first we should return -1 if needle is an empty string
        if (needle.length() == 0) return 0;

        //then we have to iterate through the hayStack array and find if the char matches the first char of needleArray
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.length() > 1) {
                    if (haystack.length() - i - 1 >= needle.length() - 1) {
                        for (int j = 1; j < needle.length(); j++) {
                            if (haystack.charAt(i + j) != needle.charAt(j)) break;
                            if (j == needle.length() - 1) return i;
                        }
                    }
                } else {
                    return i;
                }
            }
        }

        return -1;
    }

//    public char[] stringToCharArray(String str) {
//        char[] ch = new char[str.length()];
//
//        // Copy character by character into array
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//        }
//        return ch;
//    }


}
