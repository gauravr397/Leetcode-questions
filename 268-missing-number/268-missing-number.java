class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int nsum=n*(n+1)/2;
        int tot=0;
        for(int i=0;i<n;i++){
            tot+= nums[i];
        }
        
        return nsum-tot;
    }
}