package easy;

import medium.UglyNumberIII;

public class UglyNumber {

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();

        System.out.println(uglyNumber.isUgly(6));
        System.out.println(uglyNumber.isUgly(1));
        System.out.println(uglyNumber.isUgly(14));
        System.out.println(uglyNumber.isUgly(8));
    }


    public boolean isUgly(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 == 0) return isUgly(n / 2);
        if (n % 3 == 0) return isUgly(n / 3);
        if (n % 5 == 0) return isUgly(n / 5);

        return false;
    }

}
