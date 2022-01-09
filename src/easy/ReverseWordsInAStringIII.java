package easy;

import java.util.Arrays;

/*

557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"


Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.

*/
public class ReverseWordsInAStringIII {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";


//        String s = "God Ding";

        ReverseWordsInAStringIII words = new ReverseWordsInAStringIII();

        System.out.println(words.reverseWords(s));
        System.out.println("s'teL ekat edoCteeL tsetnoc");
    }

    public String reverseWords(String s) {
        String[] strings = s.split(" ");

        for (int i = 0; i < strings.length; i++) {
            strings[i] = reverseWord(strings[i]);
        }
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (i != strings.length - 1) {
                text.append(strings[i]).append(" ");
            } else {
                text.append(strings[i]);
            }
        }
        return text.toString();
    }

    public String reverseWord(String word) {

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }
}
