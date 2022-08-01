package easy;


import java.util.*;

public class FirstUniqueCharacterInAString387 {

    public static void main(String[] args) {
        FirstUniqueCharacterInAString387 fir = new FirstUniqueCharacterInAString387();

        System.out.println(fir.firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int k = 0;
        while (k < s.length()) {
            char c = s.charAt(k);
            map.put(c, map.getOrDefault(c, 0) + 1);
            k++;
        }

        k = 0;
        while (k < s.length()) {
            if (map.get(s.charAt(k)) == 1) {
                return k;
            }
            k++;
        }

        return -1;
    }
}
