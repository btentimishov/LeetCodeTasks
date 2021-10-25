package easy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidParentheses {

    public static void main(String[] args) {
        boolean isVal = isValid("({)}");
        if (isVal) System.out.println("Is valid");
        else System.out.println("Is not valid");
    }
    public static boolean isValid(String s) {


        if (s.length() % 2 == 1) return false;
        if (s.length() == 0) return false;

        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(new ArrayList<>(Arrays.asList("\\(", "\\)")));
        listOfLists.add(new ArrayList<>(Arrays.asList("\\[", "\\]")));
        listOfLists.add(new ArrayList<>(Arrays.asList("\\{", "\\}")));

        for (int i = 0; i < listOfLists.size(); i++) {
            while (s.contains(listOfLists.get(i).get(0).replaceFirst("\\\\", ""))
                    && s.contains(listOfLists.get(i).get(1).replaceFirst("\\\\", ""))) {
                s = s.replaceFirst(listOfLists.get(i).get(0),"");
                s = s.replaceFirst(listOfLists.get(i).get(1),"");
            }
        }
        return s.length() == 0;
    }
}
