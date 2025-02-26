package Com.practice.leetcode;

public class BuyAndSellProblem {
	public static void main(String[] args) {
		int[] nums = {1,2};
		System.out.print( maxProfit(nums));
	}
	public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;        
    }
}
