package DynamicProgrammingExamples;

import easy.FibonacciNumber;

import java.util.Arrays;

public class FibTabulation {


    public static void main(String[] args) {
        FibTabulation tabulation = new FibTabulation();

//        System.out.println(tabulation.fib(50));
        int [][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(array[i]));

        }
    }


    private int fib (int n) {
        int[] table = new int[n + 1];

        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            table[i] = table[i-1] + table[i-2];
        }

        return table[n];
    }
/*
*   private long fib (int n) {
        long[] table = new long[n + 1];

        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            table[i] = table[i-1] + table[i-2];
        }

        return table[n];
    }
*/

}
