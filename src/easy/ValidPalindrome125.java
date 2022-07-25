package easy;

import java.util.Stack;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println((char)97);
    }

    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                builder.append(c);
            }
        }

        String s1 = builder.toString();

        builder = new StringBuilder();

        char[] charArray = s1.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            builder.append(c);
        }
        String s2 = builder.toString();


        return s1.equals(s2);
    }

}
