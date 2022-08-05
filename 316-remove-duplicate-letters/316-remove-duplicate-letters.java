class Solution {
    public String removeDuplicateLetters(String s) {
        int lastIndex[] = new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        boolean visited[] = new boolean[26];
        Stack<Integer> st = new Stack();
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i)-'a';
            if(visited[c]==true)
                continue;
            while(!st.isEmpty() && st.peek()>c && lastIndex[st.peek()]>i){
                visited[st.pop()]=false;
            }
            st.push(c);
            visited[c]=true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append((char)(st.pop()+'a'));
        }
        return sb.reverse().toString();   
        
    }
}