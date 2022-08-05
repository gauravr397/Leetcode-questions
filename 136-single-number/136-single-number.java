class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i : nums){
            res^=i; // ^ xor = when 1 ^ 1 or 0 ^ 0 = 0 and 0 ^ 1=1 
        }
        return res;
    }
}