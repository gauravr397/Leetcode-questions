class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        int ans=Integer.MAX_VALUE;
        int res =Integer.MIN_VALUE;
       
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            //ans= Math.min(ans,e.getValue());
            
            int num = e.getKey();
            int freq= e.getValue();
            
            if(freq<ans){
                ans=freq;
                res=num;
            }
        }
        
        return res;
    }
}