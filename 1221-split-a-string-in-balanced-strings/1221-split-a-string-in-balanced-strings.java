class Solution {
    public int balancedStringSplit(String s) {
        int rcount=0,lcount=0,counter=0;
        for(int i:s.toCharArray()){
            if(i=='R')
                rcount++;
            if(i=='L')
                lcount++;
            if(lcount==rcount)
                counter++;
        }
        return counter;
    }
}