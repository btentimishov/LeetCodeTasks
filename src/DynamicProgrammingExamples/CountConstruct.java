package DynamicProgrammingExamples;

import java.util.HashMap;

public class CountConstruct {


    public static void main(String[] args) {
        String[] arr1 = {"ab", "abc", "cd", "def", "abcd"};
        String[] arr2 = {"bo", "rd", "ate", "t", "ska", "sk", "boar"};
        String[] arr3 = {"a", "p", "ent", "enter", "ot", "o", "t"};
        String[] arr4 = {"e", "ee", "eee", "eeee", "eeeee"};
        String[] arr5 = {"purp", "p", "ur", "le", "purpl"};
        CountConstruct construct = new CountConstruct();
        System.out.println(construct.countConstruct("abcdef", arr1, new HashMap<>())); //1
        System.out.println(construct.countConstruct("skateboard", arr2, new HashMap<>())); //0
        System.out.println(construct.countConstruct("enterapotentpot", arr3, new HashMap<>())); //4
        System.out.println(construct.countConstruct("purple", arr5, new HashMap<>())); //2
        System.out.println(construct.countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", arr4, new HashMap<>())); //0

    }


    private int countConstruct(String target, String[] wordBank, HashMap<String, Integer> memo) {

        if (memo.containsKey(target)) memo.get(target);
        if (target.length() == 0) return 1;

        int  totalCount = 0;
        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                String suffix  = target.substring(word.length());

                int numWaysForRest = countConstruct(suffix, wordBank, memo);
                totalCount += numWaysForRest;
            }
        }
        memo.put(target, totalCount);
        return totalCount;
    }

}
