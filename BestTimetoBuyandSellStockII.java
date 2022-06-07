public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        BestTimetoBuyandSellStock bstbs = new BestTimetoBuyandSellStock();
        System.out.println(bstbs.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];

            }
        }
        return profit;

    }
}
