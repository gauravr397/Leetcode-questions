class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        int max_box=0;
        for(int[] i:boxTypes){
            int no_of_box=i[0];
            int no_of_units=i[1];
            
            if(truckSize >= no_of_box){
                max_box += no_of_box*no_of_units;
                truckSize -= no_of_box;
            }
            else{
                max_box += truckSize*no_of_units;
                return max_box;
            }
            
        }
        return max_box;
    }
}