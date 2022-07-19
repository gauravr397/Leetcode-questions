class Solution {
    public int climbStairs(int n) {
        
        //Approach 1
        // int dp[] = new int[n+1];
        // dp[0]=1;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i] = dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        
        //Approach 2
        int prev1=1;
        int prev2=1;
        for(int i=2;i<=n;i++){
            int count = prev1+prev2;
            prev2=prev1;
            prev1=count;
        }
        return prev1;
    }
}