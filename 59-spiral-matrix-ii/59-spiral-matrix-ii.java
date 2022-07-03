class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
        int sr=0;
        int er=n-1;
        int sc=0;
        int ec=n-1;
        int val=1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                ans[sr][i]=val++;
            }
            sr++;
            for(int i=sr;i<=er;i++){
                ans[i][ec]=val++;
            }
            ec--;
            if(sr<=er){
                for(int i=ec;i>=sc;i--){
                    ans[er][i]=val++;
                }
            }
            er--;
            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                    ans[i][sc]=val++;
                }
            }
            sc++;
        }
        return ans;
    }
}