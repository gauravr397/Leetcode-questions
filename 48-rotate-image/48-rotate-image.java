class Solution {
    public void rotate(int[][] matrix) {
        //Indexing approach 
        // int n=matrix.length;
        // //code will run for half the length of row
        // for(int i=0;i<n/2;i++){
        //     int first=i;
        //     int last =n-1-i;
        //     //run till last col of first row
        //     for(int j=first;j<last;j++){
        //         int offset=j-first;
        //         int top=matrix[first][j];
        //         matrix[first][j]=matrix[last-offset][first];
        //         matrix[last-offset][first]=matrix[last][last-offset];
        //         matrix[last][last-offset]=matrix[j][last];
        //         matrix[j][last]=top;
        //     }
        // }
        
        //Reverse Approach
        
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
                
            }
            
        }
    }
} 