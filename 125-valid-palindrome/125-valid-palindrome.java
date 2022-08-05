class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("//s|[^a-zA-Z0-9]","").toLowerCase();
        if(s.length()<=1){
            return true;}
        char[] x=s1.toCharArray();
        int i=0;
        int j=s1.length()-1;
        while(i<j){
            if(x[i]!=x[j]){
            return false;}
        i++;
        j--;
            
    }
        return true;
    }
}