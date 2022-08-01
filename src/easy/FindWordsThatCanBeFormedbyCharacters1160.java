package easy;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedbyCharacters1160 {

    public static void main(String[] args) {
        FindWordsThatCanBeFormedbyCharacters1160 f = new FindWordsThatCanBeFormedbyCharacters1160();


        f.countCharacters(new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin", "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb", "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl", "boygirdlggnh", "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx", "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop", "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx", "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr", "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo", "oxgaskztzroxuntiwlfyufddl", "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp", "qnagrpfzlyrouolqquytwnwnsqnmuzphne", "eeilfdaookieawrrbvtnqfzcricvhpiv", "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz", "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue", "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv", "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo", "teyygdmmyadppuopvqdodaczob", "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs", "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"}, "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp");

    }


    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();


        int charsLength = chars.length();
        int k = 0;
        while (k < charsLength) {
            char c = chars.charAt(k);
            map.put(c, map.getOrDefault(c, 0) + 1);
            k++;
        }

        int result = 0;

        int j = 0;
        while (j < words.length) {

            Map<Character, Integer> temp = new HashMap<>(map);

            String word = words[j];
            int wordSize = word.length();
            if (wordSize > charsLength) {
                j++;
                continue;
            }
            int i = 0;
            while (i < wordSize) {
                char c = word.charAt(i);
                if (!temp.containsKey(c)) break;

                if (temp.get(c) <= 0) break;

                temp.put(c, temp.get(c) - 1);

                if (i == wordSize - 1) {
                    result += wordSize;
                    break;
                }
                i++;
            }
            j++;
        }


        return result;

    }
}
