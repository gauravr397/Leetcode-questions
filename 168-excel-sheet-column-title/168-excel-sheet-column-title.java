class Solution {
    public String convertToTitle(int columnNumber) {
//         String res="";
        
//         int n=columnNumber;
//         while(n>0){
//             int x = (n-1)%26;
//             res+=(char)(x+'A');
//             n/=26;  
//         }
//         return res;
    
        
        String res = "";
        while(columnNumber > 0){
            columnNumber--;
            int x = (columnNumber) % 26;
            res = (char)(x + 'A') + res;
            columnNumber /= 26;
        }
        return res;
    }
}

