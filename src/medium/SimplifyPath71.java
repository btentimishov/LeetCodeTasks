package medium;

import java.util.Iterator;
import java.util.Stack;

public class SimplifyPath71 {
    public static void main(String[] args) {
        SimplifyPath71 simplifyPath71 = new SimplifyPath71();
//        simplifyPath71.simplifyPath("/a/../../b/../c//.//");
        simplifyPath71.simplifyPath("/a//b////c/d//././/..");

        // "/a//b////c/d//././/.." "/a/../../b/../c//.//" "/a/./b/../../c/"
    }

    public String simplifyPath(String path) {
        Stack<Character> stack = new Stack<>();
        int size = path.length();
        char dot = '.';
        char slash = '/';
        for (int i = 0; i < size; i++) {
            char c = path.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (c == slash) {
                char cPrev = stack.peek();
                if (cPrev == slash && i == size - 1 && i > 0) {
                    stack.pop();
                    continue;
                }
                if (cPrev == slash || i == size - 1) continue;
                stack.push(c);
            } else if (c == dot) {
                char cPrev = stack.peek();
                char cNext = i == size - 1 ? path.charAt(i + 1) : '9';


                if (cNext == dot && cPrev == dot) {
                    stack.push(c);
                    stack.push(cNext);
                    i++;
                } else if (cNext != dot && cPrev == dot) {

                    if (Character.isLetter(cNext)) {
                        stack.push(c);
                    }
                    stack.pop(); //prev dot is deleted
                    if (stack.isEmpty()) continue;


                    cPrev = stack.peek();
                    if (cPrev == slash) {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(cPrev);
                        } else {
                            while (stack.peek() != slash) {
                                stack.pop();
                            }
                        }
                    }
                    //delete somehow the home view
                } else if (cNext == dot) {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (Character c : stack) {
            builder.append(c);
        }
        return builder.toString();

    }

    /*  public String simplifyPath(String path) {
        Stack<Character> stack = new Stack<>();
        int size = path.length();

        for (int i = 0; i < size; i++) {
            char c = path.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (c == '/') {
                char cPrev = stack.peek();
                if (cPrev == '/' && i == size - 1) {
                    stack.pop();
                    continue;
                }
                if (cPrev == '/' || i == size - 1) continue;
                stack.push(c);
            }
            else if (c == '.') {
                //problems with dots
                //accepted "/a/./b/../../c/", "/home/", "/home//foo/"
                //
                //not accepted "/../"
                char cPrev = stack.peek();
                int val = 1;
                if (cPrev == '.') {
                    val++;
                }

                if (i != size - 1 ) {
                    char cNext = path.charAt(i + 1);
                    if (cNext == '.') {
                        val++;
                        if (val == 2) {
                            //we should delete the last path if char exist ()
                            char ccPrev = stack.pop();
                            if (stack.isEmpty()) {
                                stack.push(ccPrev);
                                continue;
                            }
                            if (Character.isLetter(stack.peek())) {
                                while (stack.peek() != '/') {
                                    stack.pop();
                                }
                            } else {
                                stack.push(ccPrev);
                            }
                            continue;
                        }
                    }
                }


                if (val == 3) {
                    //just leave it like that
                    stack.push(c);
                }
            }
            else {
                stack.push(c);
            }
        }



        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            Character c = stack.get(i);
            if (i == stack.size() - 1 && i > 0) {
                if (c == '/')
                    continue;
            }
            builder.append(c);
        }
        return builder.toString();

    }*/
}
