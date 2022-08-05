class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Integer> freq = new ArrayList(map.values());
        Collections.sort(freq, Collections.reverseOrder());
        
        int count=0;
        int n= arr.length;
        int tot = n;
        int i=0;
        
        while(tot>n/2){
            tot=tot-freq.get(i);
            i++;
            count++;
        }
        return count;
    }
}