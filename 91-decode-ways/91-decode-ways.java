class Solution {
    public int numDecodings(String s) {
        int n= s.length();
        int dp[]= new int[n+1];
        
        dp[n]=1;
        dp[n-1]=onedigit(s.charAt(n-1)) ? 1 : 0;
        
        for(int i=n-2;i>=0;i--){
            if(onedigit(s.charAt(i)))
                dp[i]+=dp[i+1];
            if(twodigit(s.charAt(i),s.charAt(i+1)))
                dp[i]+=dp[i+2];
        }
        return dp[0];
    }
        
        public boolean onedigit(char c){
            return c!='0';
        }
        
        public boolean twodigit(char c1,char c2){
            return c1=='1' || c1 =='2' && c2<'7';
        }

}