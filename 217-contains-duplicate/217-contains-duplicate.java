class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //Aproach I
//         Arrays.sort(nums);
//             for(int j=0;j<nums.length-1;j++){
//                 if(nums[j] == nums[j+1]){
//                     return true;
//                 }
                
                  
//             }
        
        
//             return false;
        
        Set<Integer> set = new HashSet();
        for(int i :nums){
            if(set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
       
    }
               
}