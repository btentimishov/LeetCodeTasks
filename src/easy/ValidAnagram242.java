package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram242 {
    public static void main(String[] args) {
        ValidAnagram242 v = new ValidAnagram242();
        System.out.println(v.isAnagram("anagram","nagaram"));
        System.out.println(v.isAnagram("rat","car"));
    }

/*    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (char c :
                map1.keySet()) {
            if (map2.containsKey(c)) {
                if (!Objects.equals(map1.get(c), map2.get(c))) return false;
            } else {
                return false;
            }
        }
        for (char c :
                map2.keySet()) {
            if (map1.containsKey(c)) {
                if (!Objects.equals(map2.get(c), map1.get(c))) return false;
            } else {
                return false;
            }
        }

        return true;
    }*/


    public boolean isAnagram(String s, String t) {
        int[] map = new int[128];

        for (char c: s.toCharArray()) {
            map[c]++;
        }
        for (char c: t.toCharArray()) {
            map[c]++;
        }

        for (int c :
                map) {
            if (c % 2 == 1) return false;
        }

        return true;
    }
}
