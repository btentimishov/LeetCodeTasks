package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString394 {
    public static void main(String[] args) {
        DecodeString394 dec = new DecodeString394();
//        String s = "0123456789";
//        System.out.println(s.substring(5, 9));
        System.out.println(dec.decodeString("3[a]2[c]")); // aaacc

    }

    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();

        String res = "";
        int index = 0;


        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') {

                result.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(result.pop());

                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            } else {
                res += (s.charAt(index));
                index++;
            }
        }

        return res;

    }

//    public ArrayList<String> decodeString2(String s) {
//        ArrayList<String> result = new ArrayList<>();
//
//        if (s.equals("")) {
//            result.add(0, "");
//            return result;
//        }
//
//        StringBuilder builder = new StringBuilder();
//        int number = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char data = s.charAt(i);
//            if (data == '[') {
//
//                List<String> loopResult = decodeString2(s.substring(i + 1));
//                String gotString = loopResult.get(0);
//
//                i = Integer.parseInt(loopResult.get(1));
//                System.out.println(i);
//                builder.append(String.valueOf(gotString).repeat(number));
//            } else if (Character.isDigit(data)) {
//                number = Integer.parseInt(String.valueOf(data)); // convert char digit value to int
//            } else if (data == ']') {
//                i++;
//                result.add(0, builder.toString());
//                result.add(1, String.valueOf(i));
//                return result;
//            } else {
//                builder.append(data);
//            }
//        }
//        return result;
//}


}
