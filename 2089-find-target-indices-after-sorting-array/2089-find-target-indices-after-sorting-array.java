class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res=new ArrayList();
        //Arrays.sort(nums);
        int n=nums.length;
        int start=0,freq=0;
        for(int i:nums){
            if(i<target)
                start++;
            else if(i==target)
                freq++;
        }
        for(int i=start;i<start+freq;i++){
            res.add(i);
        }
        return res;
    }
}