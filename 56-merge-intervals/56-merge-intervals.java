class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)return intervals;
        
        Arrays.sort(intervals , (a,b) -> a[0]-b[0]);
        List<int[]> output = new ArrayList<>(); 
        int[] curr_intval = intervals[0];
        output.add(curr_intval);
        for(int[] interval : intervals){
            int curr_begin = curr_intval[0];
            int curr_end= curr_intval[1];
            int next_begin=interval[0];
            int next_end=interval[1];
            if(curr_end>=next_begin){
                curr_intval[1]=Math.max(curr_end,next_end);
            }else{
                curr_intval=interval;
                output.add(curr_intval);
            }

        }
        return output.toArray(new int[output.size()][]);
    }
}