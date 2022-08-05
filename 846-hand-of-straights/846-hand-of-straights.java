class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length%groupSize!=0)return false;
        
        Queue<Integer> pq = new PriorityQueue();
        
        for(int i : hand){
            pq.add(i);
        }
        
        while(!pq.isEmpty()){
            int curr = pq.poll();
            for(int i=1;i<groupSize;i++){
                if(!pq.remove(curr+i))
                    return false;
            }
        }
        return true;
    }
}