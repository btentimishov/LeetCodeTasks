package DynamicProgrammingExamples;

import java.util.HashMap;

/*
m = target length
n = wordBank.length

Brute Force
time: O(m * n^m)
space: O(m^2)

Memoized
time: O(n * m^2)
space: O(m^2)


*/
public class CanCanstruct {

    public static void main(String[] args) {
        CanCanstruct canCanstruct = new CanCanstruct();
        String[] arr1 = {"ab", "abc", "cd", "def", "abcd"};
        String[] arr2 = {"bo", "rd", "ate", "t", "ska", "sk", "boar"};
        String[] arr3 = {"a", "p", "ent", "enter", "ot", "o", "t"};
        String[] arr4 = {"e", "ee", "eee", "eeee", "eeeee"};

        System.out.println(canCanstruct.canConstruct("abcdef", arr1, new HashMap<>())); //true
        System.out.println(canCanstruct.canConstruct("skateboard", arr2, new HashMap<>())); //false
        System.out.println(canCanstruct.canConstruct("enterapotentpot", arr3, new HashMap<>())); //true
        System.out.println(canCanstruct.canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", arr4, new HashMap<>())); //false

    }


    private boolean canConstruct(String target, String[] wordBank, HashMap<String, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.length() == 0) return true;

        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                String suffix = target.substring(word.length());
                if (canConstruct(suffix, wordBank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }

        }
        memo.put(target, false);
        return false;
    }
}
