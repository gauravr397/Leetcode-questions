class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // List<Integer> ans = new ArrayList<>();
        // Set<Integer> set= new HashSet<>();
        // if(nums.length<=1)return null;
        // for(int i=0;i<nums.length;i++){
        //     if(!set.contains(nums[i]))
        //         set.add(nums[i]);
        //     else
        //         ans.add(set.get(nums[i]));
        // }
        // return ans;
        
        
        List<Integer> res = new ArrayList<>();
        int i=0;
        Arrays.sort(nums);
        while(i<(nums.length-1)){
            if(nums[i] == nums[i+1]){
                res.add(nums[i]);
                i++;
            }else{
                i++;
            }
        }
        return res;
    }
}