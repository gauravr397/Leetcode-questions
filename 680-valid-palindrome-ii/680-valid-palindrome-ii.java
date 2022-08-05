class Solution {
    public boolean validPalindrome(String s) {
        int ss=0,se=s.length()-1;
        while(ss<se){
            if(s.charAt(ss)!=s.charAt(se))
                return (valpal(s,ss+1,se) || valpal(s,ss,se-1));
            ss++;
            se--;
        }
        return true;
    }
    
    public boolean valpal(String s,int ss,int se){
        while(ss<se){
        if(s.charAt(ss)!=s.charAt(se))
            return false;
        ss++;
        se--;
        }
        return true;
    }
    
}