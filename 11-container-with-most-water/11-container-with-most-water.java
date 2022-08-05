class Solution {
    public int maxArea(int[] height) {
      //Approach I Brute force -> Timelimit exceeds  
//         int ans=0;
//         int min=0;
        
//         for(int i= 0;i<height.length;i++){
//             for(int j=i+1;j<height.length;j++){
//                 min = Math.min(height[i],height[j]);
//                 ans=Math.max(ans,min*(j-i));
//             }
//         }
//         return ans;
        
        //Approach II 
        int left=0;
        int right=height.length-1;
        int min=0;
        int ans=0;
        while(left<right){
            min = Math.min(height[left],height[right]);
            ans= Math.max(ans,min*(right-left));
                                     
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        
        return ans;
    }
}