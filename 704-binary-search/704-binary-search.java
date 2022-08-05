class Solution {
    public int search(int[] nums, int target) {
        int n =0;
        int m =nums.length;
        while(n<m){
            int mid =(n+m)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                n=mid+1;
            else
                m=mid;
        }
        return -1;
    }
}