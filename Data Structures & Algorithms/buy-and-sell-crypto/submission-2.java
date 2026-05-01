class Solution {
    public int maxProfit(int[] prices) {
        int lowestBuyPrice = 101;
        int highestProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1] < lowestBuyPrice) {
                lowestBuyPrice = prices[i-1];
            }

            int profit = prices[i] - lowestBuyPrice;

            if (profit > highestProfit) {
                highestProfit = profit;
            }
        }

        return highestProfit;
    }
}
