import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.findAnagrams("cbaebabacd", "abc"));
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

//            char c = s.charAt(i);
//            if (!map.containsKey(c)) {
//                temp = new HashMap<>(map);
//                continue;
//            }

/*
*
                String str = s.substring(i, i + (size - 1));

                for (int j = 0; j < size; j++) {
                    char c = str.charAt(j);
                    if (temp.containsKey(c)) {
                        temp.put(c, temp.get(c) - 1);
                        if (temp.get(c) == 0) {
                            temp.remove(c);
                        }
                        if (temp.isEmpty()) {
                            result.add(i);
                            break;
                        }
                    } else {
                        i += j + 1;
                        break;
                    }
                }*/