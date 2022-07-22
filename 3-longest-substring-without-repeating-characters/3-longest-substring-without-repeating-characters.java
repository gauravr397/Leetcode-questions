class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        Set<Character> set = new HashSet();
        int len = 0;
        while(r<s.length()){
            char ch = s.charAt(r);
            if(!set.contains(ch)){
                set.add(ch);
                len=Math.max(len,r-l+1);
                r++;
                
            }
            else{
                while(s.charAt(l)!=s.charAt(r)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.remove(s.charAt(l));
                l++;
                
            }
        }
        return len;
        
    }
}