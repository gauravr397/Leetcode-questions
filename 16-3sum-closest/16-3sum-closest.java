class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int a_pnt = i+1;
            int b_pnt = nums.length-1;
            
            while(a_pnt < b_pnt){
                int curr_sum = nums[i] + nums[a_pnt] + nums[b_pnt];
                if(curr_sum > target){
                    b_pnt -=1;
                    
                }
                else{
                    a_pnt += 1;
                    
                }
                if(Math.abs(curr_sum-target) < Math.abs(result - target)){
                    result = curr_sum;
                }
            }
        }
        return result;
    }
}