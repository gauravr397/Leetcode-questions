class Solution {
    public boolean isAnagram(String s, String t) {
        
//         if(s.length()!=t.length())
//             return false;
//         int freq[] = new int[26];
        
//         for(int i=0;i<s.length();i++){
//             freq[s.charAt(i)-'a']++;
//             freq[t.charAt(i)-'a']--;
//         }
        
        
//         for(int i:freq){
//             if(i!=0)
//                 return false;
//         }
//         return true;
        
        // OR 
        if(s.length()!=t.length())
            return false;
        int freq[] = new int[128];
        
        for(char i:s.toCharArray()){
            freq[i]++;
            
        }
        for(char i:t.toCharArray()){
            freq[i]--;
        }
        
        
        for(int i:freq){
            if(i!=0)
                return false;
        }
        return true;
    }
}