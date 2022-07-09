class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)return intervals;
        
        Arrays.sort(intervals , (a,b) -> a[0]-b[0]);
        List<int[]> output = new ArrayList<>(); 
        int[] curr_i = intervals[0];
        output.add(curr_i);
        for(int[] i : intervals){
            int curr_begin = curr_i[0];
            int curr_end= curr_i[1];
            int next_begin=i[0];
            int next_end=i[1];
            if(curr_end>=next_begin){
                curr_i[1]=Math.max(curr_end,next_end);
            }else{
                curr_i=i;
                output.add(curr_i);
            }

        }
        return output.toArray(new int[output.size()][]);
    }
    
}

    