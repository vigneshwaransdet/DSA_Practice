package DSA_15_Days_Crash_Plan.Jun_17_2026;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Best_Time_To_Buy_And_Sell_Stock_121 {

    @Test
    public void test01() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expect = 5;
        Assert.assertEquals(expect, maxProfit(prices));
    }

    @Test
    public void test02() {
        int[] prices = {7,6,4,3,1};
        int expect = 0;
        Assert.assertEquals(expect, maxProfit(prices));
    }

    @Test
    public void test03() {
        int[] prices = {2,4,1};
        int expect = 2;
        Assert.assertEquals(expect, maxProfit(prices));
    }

    //Brute Force Approach Using Two pointers
//    public int maxProfit(int[] prices) {
//        int S = 0, F = S + 1, curProfit = 0, maxProfit = 0;
//        while (S < prices.length) {
//            if ((F < prices.length) && (prices[S] < prices[F])) {
//                curProfit = prices[F] - prices[S];
//            }
//            maxProfit = Math.max(curProfit, maxProfit);
//            F++;
//            if (F > prices.length - 1) {
//                S++;
//                F = S + 1;
//            }
//        }
//        if (maxProfit == 0) {
//            return 0;
//        }
//        return maxProfit;
//    }

    //Wrong Solution
//    public int maxProfit(int[] prices) {
//        int minIndex = 0, minVal = Integer.MAX_VALUE;
//        int S=0, F=0, curProfit=0,maxProfit=0;
//        while(F < prices.length) {
//            if ( minVal > prices[F]) {
//                minVal = prices[F];
//            }
//            F++;
//        }
//        F=0;
//        while(F < prices.length) {
//            if(minVal == prices[F]) {
//                minIndex = F;
//                break;
//            }
//            F++;
//        }
//        S=minIndex;
//        if(!(S >=  prices.length)) {
//            F=S+1;
//        }
//        else {
//            return 0;
//        }
//        while(S < prices.length) {
//            if( (F < prices.length) && (prices[S] < prices[F]) ) {
//                curProfit = prices[F] - prices[S];
//            }
//            maxProfit = Math.max(curProfit, maxProfit);
//            F++;
//            if ( F > prices.length-1 ) {
//                S++;
//                F=S+1;
//            }
//        }
//        return maxProfit;
//    }

    //Optmized Solution:
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], profit = 0, maxProfit = 0;
        for(int i=1; i< prices.length; i++) {
            profit = prices[i] - minPrice;
            maxProfit = Math.max(profit, maxProfit);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxProfit;
    }
}
