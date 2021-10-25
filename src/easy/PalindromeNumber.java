package easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
////        System.out.println(isPalindrome(2147483647));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }

        String s = String.valueOf(Integer.valueOf(x));
        String[] c = s.split("");

        int j = c.length - 1;
        for (int i = 0; i < c.length / 2; i++) {
            if (!(c[i].equals(c[j]))) {
                return false;
            }
            j--;
        }

        return true;
    }
}
