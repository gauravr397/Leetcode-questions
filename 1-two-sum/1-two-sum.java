class Solution {
    public int[] twoSum(int[] nums, int target)  {
       HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int reqkey=target-nums[i];
            if(map.containsKey(reqkey)){
                return new int[] {map.get(reqkey),i};
            }else{
                map.put(nums[i],i);
            }
         
            
        }
        return null;
    } 
}