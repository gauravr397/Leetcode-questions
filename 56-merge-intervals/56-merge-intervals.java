class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList();
        int[] curr =intervals[0];
        list.add(curr);
        for(int[] i:intervals){
            int fbegin = curr[0];
            int fend = curr[1];
            int ebegin = i[0];
            int eend = i[1];
            
            if(fend>=ebegin){
                curr[1]=Math.max(fend,eend);
            }
            else{
                curr=i;
                list.add(curr);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}