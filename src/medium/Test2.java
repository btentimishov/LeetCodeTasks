package medium;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Tet tetName = new Tet();
//        System.out.println("Before update: " + tetName.age);
//        int newAge = tetName.updateAge2();
//
//        System.out.println("After update: " + newAge);

        Test2 test2 = new Test2();
        System.out.println(test2.letterCombinations("23").toString());
    }


    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> result = new ArrayList<>();


        String first = map[digits.charAt(0) - '0'];
        for (int j = 0; j < first.length(); j++) {
            char c = first.charAt(j);
            result.add(String.valueOf(c));
        }


        for (int i = 1; i < digits.length(); i++) {

            String digitValues = map[digits.charAt(i) - '0'];

//            List<String> temp = new ArrayList<>();
            for (int k = 0; k < result.size(); k++) {
//                String str = result.get(k);
                for (int j = 0; j < digitValues.length(); j++) {
                    char c = digitValues.charAt(j);

                    result.add(j, result.get(j) +""+ c);
//                    temp.add(str + "" + c);
                }
            }
//            result = temp;
        }

        return result;
    }
}
