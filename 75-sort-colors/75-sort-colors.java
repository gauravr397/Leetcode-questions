class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums.length==1)return;
        int start=0,curr=0,end=nums.length-1;
        while(curr<=end && start<end){
            if(nums[curr]==0){
                nums[curr]=nums[start];
                nums[start]=0;
                start++;
                curr++;
                
            }
            else if(nums[curr]==2){
                nums[curr]=nums[end];
                nums[end]=2;
                end--;
                
            }
            else{
                curr++;
            }
        }
        
    }
}