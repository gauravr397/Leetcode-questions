class Solution {
    public int firstUniqChar(String s) {
        int ans[]= new int[128];
        for(char c:s.toCharArray()){
            ans[c]++;
        }
        for(int i=0;i<s.length();i++){
            if(ans[s.charAt(i)]==1)
                return i;
        }
        return -1;
    }
}