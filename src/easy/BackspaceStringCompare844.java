package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BackspaceStringCompare844 {
    public static void main(String[] args) {
        BackspaceStringCompare844 back = new BackspaceStringCompare844();


        System.out.println(back.backspaceCompare("y#fo##f", "y#f#o##f"));
//        System.out.println(back.backspaceCompare("ab#c", "ad#c"));
    }

    public boolean backspaceCompare(String s, String t) {
        //we have to check if s or t equals to '#'
        if (s.equals("#") || t.equals("#")) return s.equals(t);
        if (s.equals(t)) return true;

        String sResult = buildCleanedString(s);
        String tResult = buildCleanedString(t);

        return sResult.equals(tResult);
    }

    private static String buildCleanedString(String s) {
        Stack<Character> sStack = new Stack<>();
        for (char letter : s.toCharArray()) {
            if (letter == '#') {
                if (!sStack.isEmpty()) sStack.pop();
            } else sStack.push(letter);
        }
        return String.valueOf(sStack);
    }

}
