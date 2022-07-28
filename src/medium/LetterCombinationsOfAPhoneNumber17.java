package medium;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinationsOfAPhoneNumber17 {




    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        Map<Integer, List<Character>> map = prepareMap();

        List<String> result = new ArrayList<>();


        for (int i = 0; i < digits.length(); i++) {
            List<Character> digitValues = map.get(digits.charAt(i) - '0');
            if (result.size() == 0) {
                int j = 0;
                while (j < digitValues.size()) {
                    char c = digitValues.get(j);
                    result.add(String.valueOf(c));
                    j++;
                }
                continue;
            }

            List<String> temp = new ArrayList<>();
            int j = 0;
            while (j < result.size()) {
                String str = result.get(j);
                int k = 0;
                while (k < digitValues.size()) {
                    char c = digitValues.get(k);
                    temp.add(str + "" + c);
                    k++;
                }
                j++;
            }
            result.clear();
            result.addAll(temp);
        }

        return result;

    }

    private static Map<Integer, List<Character>> prepareMap() {
        Map<Integer, List<Character>> map = new HashMap<>();

        map.put(2, Arrays.asList('a', 'b', 'c'));
        map.put(3, Arrays.asList('d', 'e', 'f'));
        map.put(4, Arrays.asList('g', 'h', 'i'));
        map.put(5, Arrays.asList('j', 'k', 'l'));
        map.put(6, Arrays.asList('m', 'n', 'o'));
        map.put(7, Arrays.asList('p', 'q', 'r', 's'));
        map.put(8, Arrays.asList('t', 'u', 'v'));
        map.put(9, Arrays.asList('w', 'x', 'y', 'z'));
        return map;
    }
}
