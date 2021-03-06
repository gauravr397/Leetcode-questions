class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        //Approach using freq map
//         Map<Integer,Integer> map = new HashMap();
//         for(int i:nums){
//             map.put(i,map.getOrDefault(i,0)+1);
            
//         }
//         int ans=Integer.MAX_VALUE;
//         int res =Integer.MIN_VALUE;
       
//         for(Map.Entry<Integer,Integer> e:map.entrySet()){
//             //ans= Math.min(ans,e.getValue());
            
//             int num = e.getKey();
//             int freq= e.getValue();
            
//             if(freq<ans){
//                 ans=freq;
//                 res=num;
//             }
//         }
        
//         return res;
        
        
        //Approach II
        
        int n= nums.length;
        int lo=0,hi=n-1;
        while(lo<hi){
            int mid =(lo+hi)/2;
            if(mid%2==0){
                if(mid<hi && nums[mid]!=nums[mid+1])
                    hi=mid;
                else
                    lo=mid+1;
            }
            else{
                if(mid>lo && nums[mid]!=nums[mid-1])
                    hi=mid;
                else
                    lo=mid+1;
            }
            
        }
        return nums[hi];
    }
}