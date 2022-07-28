package easy;

public class LengthOfLastWord58 {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int result = 0;

        boolean looking = false;
        int i = s.length() - 1;
        while (i >= 0) {
            if (!looking) {
                if (Character.isLetter(s.charAt(i))) {
                    looking = true;
                    result++;
                }
            } else {
                if (s.charAt(i) == ' ') return result;
                result++;
            }
            i--;
        }
        return result;
    }
}
