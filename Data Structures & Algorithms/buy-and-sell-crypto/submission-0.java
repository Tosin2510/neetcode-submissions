class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int bestBuyingPrice = prices[0];
        int maxProfit = 0;
        for (int j= 1; j< prices.length; j++) {
            if (prices[j] < bestBuyingPrice) {
                bestBuyingPrice = prices[j];
            } else {
                int currentProfit = prices[j] - bestBuyingPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }
}
