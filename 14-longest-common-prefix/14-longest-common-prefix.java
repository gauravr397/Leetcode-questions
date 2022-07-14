class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        char x[]=strs[0].toCharArray();
        char y[]=strs[strs.length-1].toCharArray();
        for(int i=0;i<x.length;i++){
            if(x[i]!=y[i])
                break;
            
            sb.append(x[i]);
        }
        return sb.toString();
    }
}