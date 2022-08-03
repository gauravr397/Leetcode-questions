class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int count[] = new int[128];
        int max=0;
        for(int l=0,r=0;r<s.length();r++){
            max = Math.max(max,++count[s.charAt(r)]);
            while(max + k < r-l+1){
                count[s.charAt(l++)]--;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
  
    }
}
