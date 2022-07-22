package easy;

import java.util.HashMap;

public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();

        System.out.println(fibonacciNumber.fib(6, new HashMap<>()));

    }


        public int fib(int n, HashMap<Integer, Integer> memo) {
            if (memo.containsKey(n)) return memo.get(n);

            if(n == 1 || n ==2) return 1;
            if(n ==0) return 0;

            int value = fib(n-1, memo) + fib(n-2, memo);
            memo.put(n, value);
            return memo.get(n);
        }
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }

}
