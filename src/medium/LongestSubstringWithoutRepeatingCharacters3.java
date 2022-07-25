package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {

    }


    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0 || s.length() == 1) return s.length();

        int result = 0; //max length of substring

        int i = 0;
        while (i < s.length()) {
            int tempLength = 0;
            Map<Character, Character> temp = new HashMap<>();
            int j = i;
            while (j < s.length()) {
                char c = s.charAt(j);
                if (temp.containsKey(c)) {
                    break;
                }
                temp.put(c, c);
                tempLength++;
                result = Math.max(tempLength, result);
                j++;
            }
            i++;
        }

        return result;
    }

}
