package com.hanteo.ct.solution2;

public class CoinResolver {

    public int resolve(InputForm form) {
        Integer sum = form.getSum();
        Integer[] coins = form.getCoins();

        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[sum];
    }
}
