class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int nsum = (n*(n+1))/2;
        int tot=0;
        for(int i:nums){
            tot+=i;
        }
        return nsum-tot;
    }
}