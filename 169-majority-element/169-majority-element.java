class Solution {
    public int majorityElement(int[] nums) {
        //Moores voting algo
       int count=1 , ansindex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[ansindex]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ansindex= i;
                count=1;
            }
        }
        return nums[ansindex];
        
       
    }
}