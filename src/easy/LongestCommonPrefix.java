package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String af[] = new String[]{"flower","flow","flight"};

        System.out.println("Prefix common: " + longestCommonPrefix(af));
    }

    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        String previous = "";
        String next = "";
        previous = getNLetters(strs[0], 1);
        for (int i = 0; i < strs.length; i++) {

            for (int j = 0; j < strs.length; j++) {

                System.out.println("Next: " + next);
                System.out.println("Previous: " + previous);

                next = getNLetters(strs[j], j+1);
                if (previous.equals(next)) {
                    previous = next;
                    System.out.println("previous = next;");
                } else {
                    System.out.println("break");
                    break;
                }
            }
            s = previous;
        }
        return s;
    }


    public static String getNLetters(String str, int n){
        return str.substring(0, n);
    }
}
