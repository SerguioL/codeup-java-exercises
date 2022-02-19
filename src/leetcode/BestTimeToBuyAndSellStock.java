package leetcode;

public class BestTimeToBuyAndSellStock {

//    You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    public static int maxProfit(int[] prices) {

        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if (prices[i] < minVal){
                minVal = prices[i];
            } else if (prices[i] - minVal > maxProfit){
                maxProfit = prices[i] - minVal;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));//5
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));//0
    }

}
