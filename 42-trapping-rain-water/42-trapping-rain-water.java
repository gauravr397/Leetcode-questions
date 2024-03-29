class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int ans=0;
        
        for(int i=0;i<n;i++){
            l[i]= i==0 ? height[i] : Math.max(l[i-1],height[i]);
            
            // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
            // [0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
            // [0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0]
            // [0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0]
            // [0, 1, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0]
            // [0, 1, 1, 2, 2, 2, 0, 0, 0, 0, 0, 0]
            // [0, 1, 1, 2, 2, 2, 2, 0, 0, 0, 0, 0]
            // [0, 1, 1, 2, 2, 2, 2, 3, 0, 0, 0, 0]
            // [0, 1, 1, 2, 2, 2, 2, 3, 3, 0, 0, 0]
            // [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 0, 0]
            // [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 0]
            // [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
        }
         for(int i=n-1;i>=0;i--){
            r[i]= i==n-1 ? height[i] : Math.max(r[i+1],height[i]);
             // System.out.println(Arrays.toString(r));
             //    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]
             //    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1]
             //    [0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1]
             //    [0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 1]
             //    [0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 1]
             //    [0, 0, 0, 0, 0, 0, 3, 3, 2, 2, 2, 1]
             //    [0, 0, 0, 0, 0, 3, 3, 3, 2, 2, 2, 1]
             //    [0, 0, 0, 0, 3, 3, 3, 3, 2, 2, 2, 1]
             //    [0, 0, 0, 3, 3, 3, 3, 3, 2, 2, 2, 1]
             //    [0, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]
             //    [0, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]
             //    [3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]
        }
        for(int i=0;i<n;i++){
            ans+=Math.min(l[i],r[i])-height[i];
        }
        return ans;
    }
}