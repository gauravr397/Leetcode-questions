class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        int count[]=new int[128];
        for(char c : s.toCharArray()){
            count[c]++;
        }
        for(int i:count){
            ans+= i%2 ==0 ? i : i - 1 ;
            
        }
        boolean OddCount = Arrays.stream(count).anyMatch(c -> c%2 == 1);
        return ans + (OddCount? 1:0);
    }
}