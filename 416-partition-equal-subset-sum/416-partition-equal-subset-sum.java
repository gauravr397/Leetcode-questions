class Solution {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2==1)
            return false;
        return knapsack(nums,sum/2);
    }
    
    public boolean knapsack(int[] nums,int subset){
        boolean dp[] = new boolean[subset+1];
        dp[0]=true;
        
        for(int i:nums){
            for(int j=subset;j>=i;j--){
                dp[j]=dp[j] || dp[j-i];
            }
        }
        return dp[subset];
    }
}