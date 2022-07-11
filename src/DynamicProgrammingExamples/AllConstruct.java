package DynamicProgrammingExamples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*
m = target length
n = wordBank.length

Brute Force
time: O(m * n^m)
space: O(m^2)

Memoized
time: O(n^m)
space: O(m)
*/
public class AllConstruct {


    private List<List<String>> allConstructMemo( String target,
                                                String[] wordBank,
                                                HashMap<String, List<List<String>>> memo) {

        // **** base case(s)****
        if (memo.containsKey(target)) return memo.get(target);
        if (target.length() == 0) return new ArrayList<>(Arrays.asList(new ArrayList<>()));

        // **** initialization ****
        List<List<String>> result = new ArrayList<>();

        // **** loop through the word bank making a recursive call (if needed) ****
        for (String word : wordBank) {

            // **** recursive call (if word is a prefix of target) ****
            if (target.indexOf(word) == 0) {

                // **** generate suffix for target ****
                String suffix = target.substring(word.length());

                // **** make recursive call ****
                List<List<String>> suffixWays = allConstructMemo(suffix, wordBank, memo);

                // **** ****
                List<List<String>> targetWays = new ArrayList<>();

                // **** add prefix to the head of each list ****
                for (int i = 0; i < suffixWays.size(); i++) {

                    // **** create a new list ****
                    List<String> tmp = new ArrayList<>(suffixWays.get(i));

                    // **** add preffix to this list ****
                    tmp.add(0, word);

                    // **** add this list to this list of lists ****
                    targetWays.add(tmp);
                }

                // **** add lists to result ****
                for (int i = 0; i < targetWays.size(); i++)
                    result.add(new ArrayList<>(targetWays.get(i)));
            }
        }

        // **** save the key-value pair ****
        memo.put(target, result);

        // **** return all possible combinations ****
        return result;
    }

    public static void main(String[] args){

        String[] arr5 = {"purp", "p", "ur", "le", "purpl"};
        String[] arr1 = {"ab", "abc", "cd", "def", "abcd", "ef", "c"};
        String[] arr2 = {"bo", "rd", "ate", "t", "ska", "sk", "boar"};
        String[] arr4 = {"e", "ee", "eee", "eeee", "eeeee"};

        AllConstruct allConstruct = new AllConstruct();

        System.out.println(allConstruct.allConstructMemo("purple", arr5, new HashMap<>()));
        System.out.println(allConstruct.allConstructMemo("abcdef", arr1, new HashMap<>()));
        System.out.println(allConstruct.allConstructMemo("skateboard", arr2, new HashMap<>()));
        System.out.println(allConstruct.allConstructMemo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf", arr4, new HashMap<>()));

    }
}
