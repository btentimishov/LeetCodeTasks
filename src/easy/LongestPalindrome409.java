package easy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {
    public static void main(String[] args) {
        LongestPalindrome409 l = new LongestPalindrome409();
        System.out.println(l.longestPalindrome("abccccdd"));
    }


    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int palLength = 0;
        boolean toAdd = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer number = entry.getValue();
            if (number % 2 == 0) {
                palLength += number;
            } else {
                palLength += number - 1;
                toAdd = true;
            }

        }
        if (toAdd) palLength++;
        return palLength;

    }
}
