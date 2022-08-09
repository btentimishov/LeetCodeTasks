package easy;

import java.util.ArrayList;
import java.util.List;

public class ExcelSheetColumnTitle168 {
    public static void main(String[] args) {


        // case: 11111 result "PKI"
        // case: 701 result "ZY"
        ExcelSheetColumnTitle168 excel = new ExcelSheetColumnTitle168();
        System.out.println(excel.convertToTitle(701));
        System.out.println(excel.convertToTitle(11111));
    }

    public String convertToTitle(int columnNumber) {
        if (columnNumber <= 26) return String.valueOf((char) (columnNumber + 64));

        List<Character> list = new ArrayList<>();

        list.add((char) (columnNumber % 26 + '@'));
        columnNumber -= columnNumber % 26;


        while (columnNumber > 0) {
            columnNumber /= 26;
            int rest = columnNumber % 26 == 0 ? 26 : columnNumber % 26;

            columnNumber -= rest;
            list.add((char) (rest + '@'));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
