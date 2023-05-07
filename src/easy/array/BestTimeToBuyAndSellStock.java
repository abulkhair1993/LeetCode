package easy.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day. *
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day. *
 * Find and return the maximum profit you can achieve.
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Total profit is 4 + 3 = 7.
 * <p>
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Total profit is 4.
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += (prices[i] - prices[i - 1]);
            }
        }
        System.out.println(maxProfit);
    }

    // optimized run time
    class Solution {

        public int maxProfit(int[] prices) {


            int n = prices.length;


            int[] next = new int[2];
            int[] curr = new int[2];

            next[0] = next[1] = 0;

            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j <= 1; j++) {
                    if (j == 1) {
                        curr[j] = Math.max(-prices[i] + next[0], next[1]);
                    } else
                        curr[j] = Math.max(prices[i] + next[1], next[0]);
                }
                next = curr;
            }

            return next[1];
        }
    }

    /***************************************************************************************************/
    //More optimized solution
    class Solution2 {
        public int maxProfit(int[] prices) {
            int[][] memo = new int[prices.length][2];
            for (int i = 0; i < prices.length; i++)
                for (int j = 0; j < 2; j++)
                    memo[i][j] = -1;
            return buySellStock(prices, 0, 1, memo);
        }

        public int buySellStock(int[] prices, int currDay, int canBuy, int[][] memo) {
            if (currDay >= prices.length)
                return 0;
            if (memo[currDay][canBuy] != -1)
                return memo[currDay][canBuy];
            if (canBuy == 1) {
                int idle = buySellStock(prices, currDay + 1, canBuy, memo);
                int buy = -prices[currDay] + buySellStock(prices, currDay + 1, negateCanBuy(canBuy), memo);
                return memo[currDay][canBuy] = Math.max(idle, buy);
            } else {
                int idle = buySellStock(prices, currDay + 1, canBuy, memo);
                int sell = prices[currDay] + buySellStock(prices, currDay + 1, negateCanBuy(canBuy), memo);
                return memo[currDay][canBuy] = Math.max(idle, sell);
            }
        }

        public int negateCanBuy(int canBuy) {
            return canBuy == 1 ? 0 : 1;
        }


    }
}


