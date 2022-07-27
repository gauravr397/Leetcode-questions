class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int ans=0;
        
        for(int i : nums){
            set.add(i);
        }
        for(int i:nums){
            
            if(set.contains(i-1))
                continue;
            int length=1;
            while(set.contains(++i))
                ++length;
            ans=Math.max(ans,length);
            
        }
        return ans;
        
        
        
        //OR  TLE
        
//         Set<Integer> set = new HashSet();
        
//        int max = -1;
//         int min = 1000000000;
//         for(int i:nums){
//             set.add(i);
//             min = Math.min(min,i);
//             max = Math.max(max,i);
//         }
        
//         int count =0;
//         int res=0;
//         for(int i=min;i<=max;i++){
//             if(set.contains(i)){
//                 count++;
//                 set.remove(i);
                
//             }
//             else{
//                 count=0;
//             }
//             res= Math.max(res,count);
//             if(set.size()<=res && count==0)break;
//         }
//         return res;
        
        
    }
}
