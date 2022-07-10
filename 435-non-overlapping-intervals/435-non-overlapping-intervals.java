class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> a[0]-b[0]);
        int[] curr_i=intervals[0];
        int count =0;
        for(int i=1;i<intervals.length;i++){
            
            
            if(curr_i[1] > intervals[i][0]){
                count++;
                if(curr_i[1] > intervals[i][1]){
                    curr_i=intervals[i];
                }
            }
            else{
                curr_i=intervals[i];
            }
            
        }
        return count;
    }
}