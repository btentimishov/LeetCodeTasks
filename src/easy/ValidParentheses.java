package easy;

import java.awt.font.FontRenderContext;
import java.sql.SQLOutput;
import java.util.*;

/*

20. Valid Parentheses
Link: https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "()[]{}";
        boolean isVal = validParentheses.isValid(s);
        if (isVal) System.out.println("Is valid");
        else System.out.println("Is not valid");
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            tryOut(stack, map, c);
        }

        return stack.size() == 0;
    }

    private static void tryOut(Stack<Character> stack, Map<Character, Character> map, char c) {
        if (map.containsKey(c)) {
            if (stack.isEmpty()) {
                stack.push(c);
                return;
            }
            char c1 = stack.peek();
            if (c1 == map.get(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        } else {
            stack.push(c);
        }
    }


}
