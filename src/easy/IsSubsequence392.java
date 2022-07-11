package easy;

public class IsSubsequence392 {
    public static void main(String[] args) {
        IsSubsequence392 subsequence392 = new IsSubsequence392();
//
        System.out.println(subsequence392.isSubsequence("abc", "ahbgdc")); //true
        System.out.println(subsequence392.isSubsequence("axc", "ahbgdc")); //false
        System.out.println(subsequence392.isSubsequence("b", "c")); //false
        System.out.println(subsequence392.isSubsequence("bb","ahbgdc")); //false
    }
    public boolean isSubsequence(String s, String t) {

        if (s.length() > t.length()) return false;
        if (s.length() == 0) return true;

        int k = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(k) == t.charAt(i)) {
                k++;
                if (k == s.length()) {
                    return true;
                }
            }

        }
        return false;
    }
}
