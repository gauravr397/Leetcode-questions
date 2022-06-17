public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        BestTimetoBuyandSellStock bs = new BestTimetoBuyandSellStock();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bs.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }
        return sell;
    }
}