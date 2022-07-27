package easy;

import java.util.List;
import java.util.Stack;

public class MaximumNestingDepthoftheParentheses1614 {


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = - 1;
        if (ruleKey.equals("type")) index = 0;
        else if (ruleKey.equals("color")) index = 1;
        else if (ruleKey.equals("name")) index = 2;

        int result = 0;
        for (List<String> item: items) {
            if (item.get(index).equals(ruleValue)) result++;
        }
        return result;
    }
    public int maxDepth(String s) {

        if (s.length() == 0 || s.length() == 1) return 0;
        int result = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == ')') {
                stack.push(c);
            }
        }

        int temp = 0;

        while (stack.size() != 0) {
            char c = stack.pop();
            temp = c == ')' ? temp + 1 : 0;
            result = Math.max(result, temp);
        }


        return result;
    }
}
