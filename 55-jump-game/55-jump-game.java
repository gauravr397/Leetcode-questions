class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int reach =0;
        while(i<nums.length && i<= reach){
            reach = Math.max(reach,i+nums[i]);
            i++;
        }
        return i==nums.length;
       
    }
}