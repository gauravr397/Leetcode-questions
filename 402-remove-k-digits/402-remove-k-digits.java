class Solution {
    public String removeKdigits(String num, int k) {
        int digit=num.length()-k;
        if(num.length()<=k)return "0";
        int top=-1,start=0;
        char res[] = num.toCharArray();
        for(int i=0;i<res.length;i++){
            
            while(top>=0 && res[top]>res[i] && k>0){
                top--;
                k--;
            }
            top++;
            res[top]=res[i];
        }
        while(start<=top && res[start]=='0')start++;
        
        String ans= "";
        for(int i=start;i<digit;i++){
            ans+= res[i];
        }
        if(ans.equals(""))return "0";
        return ans;
    }
}