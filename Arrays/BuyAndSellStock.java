package Arrays;

public class BuyAndSellStock {
  public static void BuyAndSell(int[] prices) {
    int buyStock = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (buyStock < prices[i]) {
        int Profit = prices[i] - buyStock; // Aaj ka profit
        maxProfit = Math.max(maxProfit, Profit);
      } else {
        buyStock = prices[i]; // jis din kam hai us din khareed liya!
      }
    }
    System.out.println("Max profit is: " + maxProfit);

  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    BuyAndSell(prices);
  }
}
