package easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord length = new LengthOfLastWord();
        length.lengthOfLastWord("   fly me   to   the moon  ");
    }


    public int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();


        int start = 0;
        int end = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' '){
                start = i;
            } else {
                end = i-1;
                count++;
            }
        }

        return count;
    }
}
