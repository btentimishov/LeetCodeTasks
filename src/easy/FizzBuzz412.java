package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz412 {

    public static void main(String[] args) {

    }


    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                result.add("FizzBuzz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }


    public boolean isAnagram(String s, String t) {
        if (s.equals("") || t.equals("")) return s.equals(t);
        if (s.length() > t.length() || t.length() > s.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();

        char[] charArray = t.toCharArray();
        for (char c : charArray) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        char[] charArray2 = t.toCharArray();
        for (char c : charArray2) {
            map2.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (Character key : map1.keySet()) {
            if (map1.get(key) != map2.getOrDefault(key, -1)) return false;
        }
        for (Character key : map2.keySet()) {
            if (map2.get(key) != map1.getOrDefault(key, -1)) return false;
        }

        return true;

    }
}
