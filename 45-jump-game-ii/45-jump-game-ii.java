class Solution {
    public int jump(int[] nums) {
        int ans=0,end=0,further =0;
        for(int i=0;i<nums.length-1;i++){
            further = Math.max(further,i+nums[i]);
            if(further>=nums.length-1){
                ans++;
                break;}
            if(i==end){
                ans++;
                end=further;
            }
        }
        return ans;
    }
}