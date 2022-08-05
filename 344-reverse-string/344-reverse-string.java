class Solution {
    public void reverseString(char[] s) {
        
        for(int i=0;i<s.length/2;i++){
            int oth=s.length-i-1;
            char temp = s[i];
            s[i]=s[oth];
            s[oth]=temp;
        }
    }
}