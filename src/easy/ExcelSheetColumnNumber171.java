package easy;

public class ExcelSheetColumnNumber171 {
    public static void main(String[] args) {
        ExcelSheetColumnNumber171 ecxel = new ExcelSheetColumnNumber171();
//        System.out.println(ecxel.powerOf(26, 3));
//        System.out.println(ecxel.powerOf(5, 1));
//        System.out.println(ecxel.powerOf(5, 3));
//        System.out.println("A: " + ecxel.titleToNumber("A"));
//        System.out.println("Z: " + ecxel.titleToNumber("Z"));
//        System.out.println("ZZ: " + ecxel.titleToNumber("ZZ"));
//        System.out.println("Result A: " + ecxel.titleToNumber("A"));
        System.out.println("Result AB: " + ecxel.titleToNumber("BBB"));

    }

    public int titleToNumber(String columnTitle) {
        if (columnTitle.length() == 1) return columnTitle.charAt(0) - 64;

        int number = 0;

        int i = columnTitle.length();
        int k = 0;
        while (i > 0) {
            char c = columnTitle.charAt(k);
            number += multiPlyBy26NTimes(c - 64, i);
            k++;
            i--;
        }
        return number;
    }

    int multiPlyBy26NTimes(int number, int times) {
        if (times == 1) return number;
        for (int i = 1; i < times; i++) {
            number *= 26;
        }
        return number;
    }

}
