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
        
        
    }
}