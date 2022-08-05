class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList();
        int[] curr =intervals[0];
        list.add(curr);
        for(int[] i:intervals){
            
            if(curr[1]>=i[0]){
                curr[1]=Math.max(curr[1],i[1]);
            }
            else{
                curr=i;
                list.add(curr);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}