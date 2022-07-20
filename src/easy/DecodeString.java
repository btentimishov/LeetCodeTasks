package easy;

public class DecodeString {

    public static void main(String[] args) {
        System.out.println(new DecodeString().decodeString("3[a2[c]]"));
    }

    public String decodeString(String s) {
        System.out.println(s);
        String result = s;

        while (result.contains("[") || result.contains("]")) {
            result = parseString(result);
        }

        return result;
    }

    String parseString(String s) {
        StringBuilder result = new StringBuilder();

        StringBuilder digits = new StringBuilder();
        StringBuilder text = new StringBuilder();
        int amount = 0;
        int bracketsOpened = 0;
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c) && amount == 0) {
                digits.append(c);
            } else if (c.toString().equals("[") && digits.toString().length() > 0) {
                amount = Integer.parseInt(digits.toString());
                digits = new StringBuilder();
                result.append(text);
                text = new StringBuilder();
            } else if (c.toString().equals("]") && text.toString().length() > 0 && bracketsOpened == 0) {
                for (int i = 0; i < amount; i++) {
                    result.append(text);
                }
                text = new StringBuilder();
                amount = 0;
            } else {
                if (c.toString().equals("[")) {
                    bracketsOpened++;
                } else if (c.toString().equals("]")) {
                    bracketsOpened--;
                }
                text.append(c);
            }
        }
        if (text.toString().length() > 0) {
            result.append(text);
        }

        return result.toString();
    }

}
