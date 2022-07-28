class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int merge[] = new int[target.length];
        
        for(int[] t:triplets){
            if(t[0]<=target[0] && t[1]<=target[1] && t[2]<=target[2])
                for(int i=0;i<target.length;i++){
                    
                    merge[i]=Math.max(merge[i],t[i]);
                }
        }
        return Arrays.equals(merge,target);
    }
}