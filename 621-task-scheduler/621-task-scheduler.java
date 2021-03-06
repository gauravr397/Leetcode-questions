class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
        for(char i:tasks){
            freq[i - 'A']++;
        }
        Arrays.sort(freq);
        int max_val = freq[25]-1;
        int  idle_slot = max_val*n;
        for(int i=24;i>=0;i--){
            idle_slot-= Math.min(max_val,freq[i]);
        }
        return idle_slot>0 ? idle_slot+tasks.length : tasks.length;
    }
}  