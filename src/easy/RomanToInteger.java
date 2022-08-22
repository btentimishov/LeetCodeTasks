package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {


    public static void main(String[] args) {
        int i = 'I' - '@';
        System.out.println(i);
        RomanToInteger romanToInteger = new RomanToInteger();
//        pair.put("I", 1);
//        pair.put("V", 5);
//        pair.put("X", 10);
//        pair.put("L", 50);
//        pair.put("C", 100);
//        pair.put("D", 500);
//        pair.put("M", 1000);
//        String word = "MCMXCIV";
//        int s = romanToInteger.romanToInt(word);
//        System.out.println("Word is: " + s);
    }

    //    static HashMap<String, Integer> pair = new HashMap<>();
    public int romanToInt(String s) {
        int[] map = new int[26];
        map['I' - '@'] = 1;
        map['V' - '@'] = 5;
        map['X' - '@'] = 10;
        map['L' - '@'] = 50;
        map['C' - '@'] = 100;
        map['D' - '@'] = 500;
        map['M' - '@'] = 1000;

        if (s.length() == 1) return map[s.charAt(0) - '@'];


        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //if it's last we just get the value from map
            if (i == s.length() - 1) {
                result += map[c - '@'];
                break;
            }
            char cNext = s.charAt(i + 1);

            int toAdd;

            if (c == 'I' && ((cNext == 'V') || (cNext == 'X'))) {
                //if next is V or X
                toAdd = map[cNext - '@'] - 1;
                i++;
            } else if (c == 'X' && (cNext == 'L' || cNext == 'C')) {
                //if next is L or C
                toAdd = map[cNext - '@'] - 10;
                i++;
            } else if (c == 'C' && (cNext == 'D' || cNext == 'M')) {
                //if next is D or M
                toAdd = map[cNext - '@'] - 100;
                i++;
            } else {
                toAdd = map[c - '@'];
            }

            result += toAdd;
        }

        return result;
    }
}
