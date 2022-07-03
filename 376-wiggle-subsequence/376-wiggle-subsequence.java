class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1)return nums.length;
        int prev_diff = nums[1]-nums[0];
        int count = (prev_diff!=0)? 2:1;
        for(int i=2;i<nums.length;i++){
            int curr_diff=nums[i]-nums[i-1];
            if((curr_diff<0 && prev_diff>=0) || curr_diff >0 && prev_diff<=0){
                count++;
                prev_diff=curr_diff;
            }
        }
        return count;
    }
}