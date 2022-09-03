package easy;

import java.util.Stack;

public class GuessNumberHigherorLower374 {
    int pick = 50;

    public static void main(String[] args) {
        GuessNumberHigherorLower374 gues = new GuessNumberHigherorLower374();

        gues.guessNumber(1000);
    }
    public int guessNumber(int n) {

        int guessed = guess(n);

        if (guessed == - 1) {
            return guessNumber(n / 2);
        } else if (guessed == 1) {
            return guessNumber(n  * 2);
        }

        return n;
    }

    private int guess(int n) {
        return Integer.compare(pick, n);
    }

}
