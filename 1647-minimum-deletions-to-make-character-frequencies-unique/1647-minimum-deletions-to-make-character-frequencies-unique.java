class Solution {
    public int minDeletions(String s) {
        int count=0;
        int ans[]=new int[26];
        for(char f :s.toCharArray()){
            ans[f-'a']++;
        }
        Set<Integer> set = new HashSet<>();
        for(int i:ans){
            
            while(set.contains(i)){
                i--;
                count++;
            }
            if(i>0){
                set.add(i);
            }
        }
        return count;
        
    }
}