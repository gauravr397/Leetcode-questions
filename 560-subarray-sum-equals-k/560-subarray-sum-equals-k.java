class Solution {
    public int subarraySum(int[] nums, int k) {
          int sum =0, ans=0;
        Map<Integer,Integer> map = new HashMap();
        map.put(0,1);
        for(int i:nums){
            sum+=i;
            if(map.containsKey(sum-k)){ //gin mil gya in map 
                ans+=map.get(sum-k); // inc ans with freq
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}