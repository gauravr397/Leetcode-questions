class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int roman[] = new int[131];
        roman['I']=1;
        roman['V']=5;
        roman['X']=10;
        roman['L']=50;
        roman['C']=100;
        roman['D']=500;
        roman['M']=1000;
        
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && roman[s.charAt(i)] < roman[s.charAt(i+1)])
                sum+=roman[s.charAt(i+1)] - roman[s.charAt(i++)];
            else
                sum+=roman[s.charAt(i)];
        }
        return sum;
 
    }
}