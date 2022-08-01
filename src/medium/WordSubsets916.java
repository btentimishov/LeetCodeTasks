package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSubsets916 {
    public static void main(String[] args) {
        WordSubsets916 word = new WordSubsets916();

        System.out.println(word.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"},
                new String[]{"o","e"})); // facebook, google, leetcode
    }


    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<Map<Character, Integer>> list = new ArrayList<>();

        for (String word: words2) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            list.add(map);
        }

        List<String> result = new ArrayList<>();


        for (String word : words1) {
            List<Map<Character, Integer>> tempList = new ArrayList<>(list);
            int j = 0;
            while (j < tempList.size()) {
                Map<Character, Integer> tempMap = tempList.get(j);
                for (int i = 0; i < word.length(); i++) {

                    if (tempMap.isEmpty()) {
                        tempList.remove(j);
                        break;
                    }

                    if (tempList.isEmpty()) {
                        result.add(word);
                        break;
                    }

                    char c = word.charAt(i);


                    if (tempMap.containsKey(c)) {
                        if (tempMap.get(c) == 1) {
                            tempMap.remove(c);
                            if (tempMap.isEmpty()) {
                                tempList.remove(j);
                                break;
                            }
                            j++;
                            continue;
                        }
                        tempMap.put(c, tempMap.get(c) - 1);
                    }
                }
                j++;
            }

            if (tempList.isEmpty()) result.add(word);
        }

        return result;
    }
}
