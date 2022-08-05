class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=Arrays.stream(piles).max().getAsInt();
        //int res =r;
        while(l<r){
            int hours=0;
            //mid = k 
            int k=(l+r)/2;
            for(int p:piles){
                hours+=Math.ceil((double)p/k);
                
            }
            if(hours<=h){
                //res=Math.min(res,k);
                r=k;
                
            }
            else{
                l=k+1;
            }
        }
        return r;// or u can also return l;
    }
}
