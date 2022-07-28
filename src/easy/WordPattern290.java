package easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public static void main(String[] args) {
        WordPattern290 word = new WordPattern290();
        word.wordPattern("abba",
                "dog cat cat dog");
    }


    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        Map<String, String> map = new HashMap<>();

        String[] parts = s.split(" ");

        if (pattern.length() != parts.length) return false;

        for (int i = 0; i < parts.length; i++) {
            char c = pattern.charAt(i);
            String part = parts[i];

            if (!map1.containsKey(c)) {
                if (!map2.containsKey(part)) {
                    map1.put(c, part);
                    map2.put(part, c);
                } else {
                    return false;
                }
            } else {
                String toCheck = map1.get(c);
                if (map2.containsKey(toCheck)) {
                    if (!toCheck.equals(part)) return false;
                } else {
                    return false;
                }
            }

        }
        return true;
    }
}
