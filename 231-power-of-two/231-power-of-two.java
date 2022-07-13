class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==1)return true;
        // int temp=1;
        // if(n<0)return false;
        // for(int i =1;i<31;i++){
        //     temp*=2;
        //     if(temp==n){
        //         return true;
        //     }
        // }
        // return false;
        return n < 0 ? false:Integer.bitCount(n) ==1;
    }
}