class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int maxbox=0;
        for(int[] i : boxTypes){
            int noofbox=i[0];
            int noofunit=i[1];
            
            if(truckSize>=noofbox){
                maxbox+=noofbox*noofunit;
                truckSize-=noofbox;
            }
            else{
                maxbox+=truckSize*noofunit;
                return maxbox;
            }
        }
        return maxbox;
        
    }
}