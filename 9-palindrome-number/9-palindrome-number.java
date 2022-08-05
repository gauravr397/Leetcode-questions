class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)return true;
        int n=x,rem=0;
        while(n>0){
            rem=rem*10+n%10;
            n/=10;
            if(rem==x)
                return true;
        }
        return false;
    }
}