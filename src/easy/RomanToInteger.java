package easy;

import java.util.HashMap;

public class RomanToInteger {

    static HashMap<String, Integer> pair = new HashMap<>();

    public static void main(String[] args) {


        pair.put("I", 1);
        pair.put("V", 5);
        pair.put("X", 10);
        pair.put("L", 50);
        pair.put("C", 100);
        pair.put("D", 500);
        pair.put("M", 1000);
        String word = "MCMXCIV";
        int s = romanToInt(word);

        System.out.println("Word is: " + s);
    }

    public static int romanToInt(String s) {
        if (s.length() <= 0) {
            return 0;
        } else if (s.length() == 1) {
            if (pair.containsKey("s")) {
                return pair.get(s);
            }

            return 0;
        } else {

            String[] sa = stringToCharArray(s);

            int sum = 0;

            for (int i = 0; i < sa.length; i++) {
                int a = 0;

                if ((sa[i].equals("I")) && ((i + 1) < sa.length)) {
                    if (sa[i + 1].equals("V")) {
                        a = 4;


                        sum = sum + a;
                        i++;

                        System.out.println("11 done");

                    } else if (sa[i + 1].equals("X")) {
                        a = 9;

                        sum = sum + a;
                        i++;
                        System.out.println("12 done");

                    } else {
                        sum = sum + pair.get(sa[i]);
                    }

                    System.out.println("1 done");
                } else if ((sa[i].equals("X")) && ((i + 1) < sa.length)) {
                    if (sa[i + 1].equals("L")) {
                        a = 40;
                        sum = sum + a;
                        i++;                    System.out.println("21 done");

                    } else if (sa[i + 1].equals("C")) {
                        a = 90;
                        sum = sum + a;
                        i++;
                        System.out.println("22 done");

                    } else {
                        sum = sum + pair.get(sa[i]);
                    }

                    System.out.println("2 done");


                } else if ((sa[i].equals("C")) && ((i + 1) < sa.length)) {
                    if (sa[i + 1].equals("D")) {
                        a = 400;
                        sum = sum + a;
                        i++;                    System.out.println("31 done");

                    } else if (sa[i + 1].equals("M")) {
                        a = 900;
                        sum = sum + a;
                        i++;
                        System.out.println("32 done");
                    } else {
                        sum = sum + pair.get(sa[i]);
                    }


                    System.out.println("3 done");

                } else {
                    System.out.println("Sum with index: " + i + " is a : " + sum);
                    sum = sum + pair.get(sa[i]);
                }

            }
            return sum;
        }
    }

    static String[] stringToCharArray(String x) {
        return x.split("");
    }

}
