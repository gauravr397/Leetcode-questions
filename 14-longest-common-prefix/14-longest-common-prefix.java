class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        char a[] = strs[0].toCharArray();
        char b[] = strs[strs.length-1].toCharArray();
        
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
                break;
            sb.append(a[i]);
        }
        return sb.toString();
    }
}