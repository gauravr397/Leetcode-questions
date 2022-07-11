class Solution {
    public int firstUniqChar(String s) {
        //approach 1
        int ans[]= new int[128];
        for(char c:s.toCharArray()){
            ans[c]++;
        }
        for(int i=0;i<s.length();i++){
            if(ans[s.charAt(i)]==1)
                return i;
        }
        return -1;
        
        //approach 2
//         Map<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//         }
//         char ch=s.charAt(0);
//         boolean found = false;
//         for(Map.Entry<Character,Integer> e: map.entrySet()){
//             if(e.getValue() == 1){
//                 ch = e.getKey();
//                 found = true;   
//                 break;
//             }
//         }
//         if(found){
//             return s.indexOf(ch+1);
//         }
//             return -1;
        
    }
}