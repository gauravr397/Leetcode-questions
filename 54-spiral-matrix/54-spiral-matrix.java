class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        
        while(startRow<=endRow && startCol <=endCol){
            
            //move rigth
            for(int i=startCol;i<=endCol;i++){
                res.add(matrix[startCol][i]);
            }
            startRow++;
            
             //move down
            for(int i=startRow;i<=endRow;i++){
                res.add(matrix[i][endCol]);
            }
            endCol--;
            
             //move left
           if(startRow<=endRow){
            for(int i=endCol;i>=startCol;i--){
                res.add(matrix[endRow][i]);
            }
            }
            endRow--;
            
             //move right middle
            if(startCol<=endCol) {
            for(int i=endRow;i>=startRow;i--){
                res.add(matrix[i][startCol]);
            }
            }
            startCol++;
            
        }
        return res;
        
    }
}