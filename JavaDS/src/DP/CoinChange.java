package DP;
import java.util.*;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        // bottom up with dp table
        int[] dp = new int[amount + 1];
        // the greatest # of combinations is all value 1 coins
        // so "amount" is +inf here
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        // fill all sub-problems bottom up
        for (int i = 1; i < dp.length; ++i) {
            // try each type of coin
            for (int coin : coins) {
                if (i - coin < 0) {
                    // no sol to sub-prob
                   continue;
                }
                // maintain dp[i] with min num
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return (dp[amount] != amount + 1) ? dp[amount] : -1;        
    }       

    public static void main(String[] aStrings) {
        int[] arr = new int[] {1,2,5};
        int amount = 11;
        CoinChange c = new CoinChange();
        int count = c.coinChange(arr, amount);
        System.out.println(count);

    }
}
