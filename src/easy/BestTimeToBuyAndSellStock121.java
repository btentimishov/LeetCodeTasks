package easy;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStock121 {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock121 time = new BestTimeToBuyAndSellStock121();

        int[] array1 = {7,1,5,3,6,4};
        int[] array2 = {7,6,4,3,1};
        int[] array3 = {7,1,5,3,6,4};

        System.out.println(time.maxProfit(array1));
        System.out.println(time.maxProfit(array2));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int min = prices[0];
        int biggestDiff = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            biggestDiff = Math.max(biggestDiff, prices[i] - min);
        }
        return biggestDiff;

    }
}
