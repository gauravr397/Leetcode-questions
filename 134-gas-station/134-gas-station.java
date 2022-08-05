class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans=0,sum=0,gases=0,costs=0;
        for(int i:gas){
            gases+=i;
        }
        for(int i:cost){
            costs+=i;
        }
        if(gases - costs<0)
            return -1;
        
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                sum=0;
                ans=i+1;
            }
        }
        return ans;
    }
}