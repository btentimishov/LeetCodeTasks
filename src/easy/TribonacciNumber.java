package easy;

import java.util.HashMap;

public class TribonacciNumber {
    public static void main(String[] args) {
        TribonacciNumber number = new TribonacciNumber();
        System.out.println(number.tribonacci(25));
    }

    public int tribonacci(int n) {
        return tribonacciMemo(n, new HashMap<>());
    }

    public int tribonacciMemo(int n, HashMap<Integer, Integer> memo) {

        if (memo.containsKey(n)) return memo.get(n);

        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;
        int value = tribonacciMemo(n - 1, memo) + tribonacciMemo(n - 2, memo) + tribonacciMemo(n - 3, memo);
        memo.put(n, value);
        return memo.get(n);
    }
}
