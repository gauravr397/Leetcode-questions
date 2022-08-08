class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int ans=0;
        
        for(int i=0;i<n;i++){
            l[i]= i==0 ? height[i] : Math.max(l[i-1],height[i]);
        }
         for(int i=n-1;i>=0;i--){
            r[i]= i==n-1 ? height[i] : Math.max(r[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            ans+=Math.min(l[i],r[i])-height[i];
        }
        return ans;
    }
}