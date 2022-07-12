class Solution {
    public int minCost(String colors, int[] neededTime) {
      int n=colors.length();
        int ans=0,curr=0,next=1;
        while(next<n){
            if(colors.charAt(curr)==colors.charAt(next)){
                if(neededTime[curr]<neededTime[next]){
                ans+=neededTime[curr];
                curr=next;
                next++;
                }
                else{
                    ans+=neededTime[next];
                    next++;
                }
            }
            else{
                curr=next;
                next++;
            }
        }
        return ans;
        
    }
}