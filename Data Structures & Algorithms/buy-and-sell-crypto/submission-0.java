class Solution {
    public int maxProfit(int[] prices) {

        int highestProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int buyPrice = prices[i];
            int highestSellPrice = 0;

            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] > highestSellPrice) {
                    highestSellPrice = prices[j];
                }
            }

            int profit = highestSellPrice - buyPrice;

            if (profit > highestProfit) {
                highestProfit = profit;
            }
        }

        return highestProfit;
    }
}
