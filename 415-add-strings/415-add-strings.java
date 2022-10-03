class Solution {
    public String addStrings(String num1, String num2) {
        int m=num1.length()-1;
        int n=num2.length()-1;
        int carry=0;
        String res="";
        while(m>=0 || n>=0 || carry!=0){
            int mval = m >=0 ? num1.charAt(m) -'0':0;
            int nval = n >=0 ? num2.charAt(n) -'0':0;
            m--;
            n--;
            
            int sum = mval + nval + carry;
            res =(sum%10)+res;
            carry=sum/10;
        }
        return res;
    }
}