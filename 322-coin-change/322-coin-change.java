class Solution {
    public int coinChange(int[] coins, int amount) {
//         int dp[] = new int[amount + 1];
//         Arrays.fill(dp,1,dp.length,amount+1);
//         System.out.println(Arrays.toString(dp));
        
//         for(int i:coins){
//             for(int j = i; j <=amount ;++j){
//                 dp[j]=Math.min(dp[i],dp[j-i]+1);
//             }
//         }
//         return dp[amount] == amount + 1 ? -1:dp[amount];
//     }
    
    // dp[i] := fewest # of coins to make up i
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, 1, dp.length, amount + 1);
    System.out.println(Arrays.toString(dp));

    for (final int coin : coins)
      for (int i = coin; i <= amount; ++i)
        dp[i] = Math.min(dp[i], dp[i - coin] + 1);

    return dp[amount] == amount + 1 ? -1 : dp[amount];
  }
}