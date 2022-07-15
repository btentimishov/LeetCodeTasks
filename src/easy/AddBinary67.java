package easy;

import java.util.*;

public class AddBinary67 {
    public static void main(String[] args) {
        AddBinary67 addBinary67 = new AddBinary67();


        System.out.println(addBinary67.addBinary("110", "11"));
//        System.out.println(addBinary67.addBinary("10", "10"));
//        System.out.println(addBinary67.addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        String big = a.length() > b.length() ? a : b;
        String small = a.length() > b.length() ? b : a;

        List<Integer> intStack = new ArrayList<>();


        boolean isLeft = false;

        int k = small.length() - 1;
        for (int i = big.length() - 1; i >= 0; i--) {
            int a1 = Integer.parseInt(String.valueOf(big.charAt(i)));
            int b1 = k >= 0 ? Integer.parseInt(String.valueOf(small.charAt(k))) : 0;
            int c1 = isLeft ? 1 : 0;
            int intSum = a1 + b1 + c1;

            intStack.add(intSum % 2 == 0 ? 0 : 1);
            isLeft = intSum > 1;
            k--;
        }

        if (isLeft) intStack.add(1);
        StringBuilder result = new StringBuilder();

        int i = intStack.size() - 1;
        while (i >= 0) {
            result.append(intStack.get(i));
            i--;
        }

        return result.toString();
    }

}
