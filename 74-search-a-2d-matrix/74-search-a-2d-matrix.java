class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int n= matrix.length;
        int m= matrix[0].length;
        int l=0;
        int r=m*n;
        while(l<r){
            int mid = (l+r)/2;
            int i=mid/m;
            int j = mid%m;
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]<target){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return false;
    }
}