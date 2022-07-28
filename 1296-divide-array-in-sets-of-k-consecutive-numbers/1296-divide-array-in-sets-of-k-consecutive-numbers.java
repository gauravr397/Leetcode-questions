class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0)return false;
        
        Queue<Integer> q = new PriorityQueue();
        for(int i : nums){
            q.add(i);
        }
        
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i=1;i<k;i++){
                if(!q.remove(curr+i))
                    return false;
            }
        }
        return true;
    }
}