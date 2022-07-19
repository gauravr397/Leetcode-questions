class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i:nums){
            sum=Math.max(i,i+sum);
            max= Math.max(max,sum);
        }
        return max;
    }
}