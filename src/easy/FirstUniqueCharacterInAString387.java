package easy;


import java.util.*;

public class FirstUniqueCharacterInAString387 {

    public static void main(String[] args) {
        FirstUniqueCharacterInAString387 fir = new FirstUniqueCharacterInAString387();

        System.out.println(fir.firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        char[] list = new char[s.length()];
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
            list[i] = c;
        }

        for (int i = 0; i < list.length; i++) {
            if (map.get(list[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}
