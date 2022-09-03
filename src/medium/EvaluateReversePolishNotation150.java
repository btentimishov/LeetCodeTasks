package medium;

import java.util.Stack;

public class EvaluateReversePolishNotation150 {
    public static void main(String[] args) {
        System.out.println("BISHKEK FINANZ- UND WIRTSCHAFTSHOCHSCHULE".toLowerCase());
    }



    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token: tokens) {
            if ("+".equals(token)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(token)) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second - first);
            } else if ("*".equals(token)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(token)) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second / first);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }


        return stack.peek();
    }
}
