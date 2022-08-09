package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTheSentence1859 {
    public static void main(String[] args) {
        SortingTheSentence1859 soring = new SortingTheSentence1859();

        System.out.println(soring.sortSentence("is2 sentence4 This1 a3"));

        char c = '9';
        System.out.println( c - '0');

    }


    public String sortSentence(String s) {
        String[] arr = s.split(" ");

        System.out.println(Arrays.toString(arr));

        String[] list = new String[arr.length];
        for (String word: arr) {
            int c = word.charAt(word.length() - 1) - 48;
            System.out.println("In index:"  + c);

            list[c - 1] = word.substring(0, word.length() - 1);
        }

        StringBuilder sb = new StringBuilder();
        for (String word: list) {
            sb.append(word);
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
