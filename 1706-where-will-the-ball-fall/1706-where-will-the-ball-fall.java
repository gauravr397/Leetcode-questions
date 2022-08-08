class Solution {
    public int[] findBall(int[][] grid) {
          int n=grid.length;
        int m=grid[0].length;
        int arr[]=new int[m];
        Arrays.fill(arr,-1);
        for(int i=0;i<m;i++){
            int x,y;
            x=0;y=i;
            while(true){
                if(x>=n){
                    if(y>=0 && y<m){
                        arr[i]=y;
                    }else{
                        
                    }
                    break;
                }
                else{
                    if(y+1<m && grid[x][y]==1 && grid[x][y+1]==1){
                        x++;
                        y++;
                    }else if(y-1>=0 && grid[x][y]==-1 && grid[x][y-1]==-1){
                        x++;
                        y--;
                    }else{
                        break;
                    }
                }
            }
        }
        return arr;
    }
}