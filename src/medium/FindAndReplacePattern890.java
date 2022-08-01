package medium;

import java.util.*;

public class FindAndReplacePattern890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        if (pattern.length() == 1) return Arrays.asList(words);

        Map<Character, Character> map;
        Map<Character, Character> mapToCheck;

        List<String> result = new ArrayList<>();

        int size = pattern.length();
        for (String s : words) {
            map = new HashMap<>();
            mapToCheck = new HashMap<>();

            int i = 0;
            while (i < size) {
                char key = pattern.charAt(i);
                char value = s.charAt(i);
                if (map.containsKey(key)) if (map.get(key) != value) break;
                if (mapToCheck.containsKey(value)) if (mapToCheck.get(value) != key) break;

                if (!map.containsKey(key)) map.put(key, value);
                if (!mapToCheck.containsKey(value)) mapToCheck.put(value, key);

                if (i == size - 1) result.add(s);
                i++;
            }
        }

        return result;
    }
}
