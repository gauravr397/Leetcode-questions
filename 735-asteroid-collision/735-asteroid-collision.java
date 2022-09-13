class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int a:asteroids){
            if(a>0){
                st.push(a);
            }
            else{
                while(!st.isEmpty() && st.peek() >0 && st.peek()<-a){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(a);
                }
                else if(st.peek()== -a){
                    st.pop();
                }
            }
        }
        return new ArrayList<>(st).stream().mapToInt(i -> i).toArray();
    }
}