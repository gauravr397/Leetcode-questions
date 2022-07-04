class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+= nums[i];
        }
        
        return n*(n+1)/2-tot;
    }
}