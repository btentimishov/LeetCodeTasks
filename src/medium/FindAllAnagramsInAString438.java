package medium;

import java.util.*;

public class FindAllAnagramsInAString438 {

    public static void main(String[] args) {
        String s = "30003";
        System.out.println(s.substring(0, 2-1));
//        FindAllAnagramsInAString438 find = new FindAllAnagramsInAString438();
//        Integer value = Integer.valueOf("00");
//        System.out.println(value);
//        String a = "baba";
//        String b = "ab";
//        System.out.println(find.findAnagrams(a, b));

    }

    public List<Integer> findAnagrams(String s, String p) {

        if (s.length() < p.length()) return new ArrayList<>();

        int size = p.length();

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> tempMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            char cP = p.charAt(i);
            char cS = s.charAt(i);
            map.put(cP, map.getOrDefault(cP, 0) + 1);
            tempMap.put(cS, tempMap.getOrDefault(cS, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();

        boolean mapsAreEqual = map.equals(tempMap);
        if (mapsAreEqual) {
            result.add(0);
        }

        for (int i = 1; i <= s.length() - size; i++) {


            char cPrev = s.charAt(i - 1);
            char cNext = s.charAt(i + size - 1);

            tempMap.put(cNext, tempMap.getOrDefault(cNext, 0) + 1);

            tempMap.put(cPrev, tempMap.getOrDefault(cPrev, 0) - 1);
            if (tempMap.get(cPrev) <= 0) tempMap.remove(cPrev);

            mapsAreEqual = map.equals(tempMap);
            if (mapsAreEqual) {
                result.add(i);
            }
        }

        return result;
    }


}
