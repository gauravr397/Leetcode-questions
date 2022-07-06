class Solution {
    public int fib(int n) {
//         int ans[]=new int[n+1];
//         ans[0]=0;
//         ans[1]=1;
//         if(n<=2)return 1;
//        for(int i=2;i<=n;i++){
           
//            ans[i]= ans[i-1]+ans[i-2];
//        }
//         return ans[n];
        
         if (n < 2)
      return n;

    int[] dp = {0, 0, 1};

    for (int i = 2; i <= n; ++i) {
      dp[0] = dp[1];
      dp[1] = dp[2];
      dp[2] = dp[0] + dp[1];
    }

    return dp[2];
      
    }
}