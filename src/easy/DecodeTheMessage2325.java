package easy;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage2325 {

    public static void main(String[] args) {

    }

    public String decodeMessage(String key, String message) {


        Map<Character, Character> map = new HashMap<>();

        int i = 97;

        for (int j = 0; j < key.length(); j++) {
            if (map.size() == 26) break;
            char c = key.charAt(j);
            if (Character.isLetter(c)) {
                if (!map.containsKey(c)) {
                    map.put(c, (char) i);
                    i++;
                }
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < message.length(); j++) {
            char c = message.charAt(j);
            builder.append(Character.isLetter(c) ? map.get(c) : c);
        }

        return builder.toString();
    }


}
