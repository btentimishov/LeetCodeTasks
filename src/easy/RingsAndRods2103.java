package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RingsAndRods2103 {


    public static void main(String[] args) {
        RingsAndRods2103 rods = new RingsAndRods2103();

//        System.out.println(rods.countPoints("B0B6G0R6R0R6G9"));
        System.out.println(rods.countPoints("B0R0G0R9R0B0G0"));
        System.out.println(rods.countPoints("G4"));
    }

    public int countPoints(String rings) {


        String[] arr = new String[10];
        int amount = 0;

        for (int i = 1; i < rings.length(); i += 2) {
            int indexOfCurr = rings.charAt(i) - '0';
            char prevValue = rings.charAt(i - 1);

            arr[indexOfCurr] = arr[indexOfCurr] + "" + prevValue;

            String s = arr[indexOfCurr];
            if (s.contains("R") && s.contains("G") && s.contains("B")) {
                amount++;
            }
        }


        return amount;


/*
        String[] arr = new String[10];

        for (int i = 1; i < rings.length(); i += 2) {
            int index = rings.charAt(i) - '0';
            char prevValue = rings.charAt(i - 1);

            arr[index] = arr[index] + "" + prevValue;
        }

        int amount = 0;


        for (String s : arr) {
            if (s != null) {
                if (s.contains("R") && s.contains("G") && s.contains("B")) {
                    amount++;
                }
            }
        }

        return amount;*/
    }
}
