package medium;

import java.util.*;

public class FindAllAnagramsInAString438 {

    public static void main(String[] args) {

        FindAllAnagramsInAString438 find = new FindAllAnagramsInAString438();

        String a = "baba";
        String b = "ab";
        System.out.println(find.findAnagrams(a, b));

    }

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length()<p.length()) return result;
        Map<Character, Integer> letters = new HashMap<>();

//        letters.getOrDefault('c', 'd');
        char[] arr = new char[p.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = p.charAt(i);
        }
        Arrays.sort(arr);

        String sortedP = new String(arr);

        for (int i = 0; i < p.length(); i++) {
            letters.put(p.charAt(i), letters.getOrDefault(p.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (letters.containsKey(s.charAt(i))) {
                boolean broken = false;
                arr = new char[p.length()];
                for (int j = i; j < p.length() + i; j++) {
                    if (j >= s.length()) break;


                    if (letters.containsKey(s.charAt(j))) {
                        arr[j-i] = s.charAt(j);
//                        if (!foundLetters.containsKey(s.charAt(j))) {
//                            foundLetters.put(s.charAt(j), s.charAt(j));
//
//                            if (foundLetters.size() == letters.size()) result.add(i);
//                        }
                    } else {
                        broken = true;
                        break;
                    }
                }

                if (broken) continue;

                Arrays.sort(arr);

                String newValue = new String(arr);

                if (sortedP.equals(newValue)) {
                    result.add(i);
                }
            }
        }
        System.out.println(result);
        return result;
    }


}
