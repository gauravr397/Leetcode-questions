class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        int ans[] =new int[nums1.length];
        for(int i:nums2){
            while(!stack.isEmpty() && stack.peek()<i){
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }
        
        for(int i=0;i<nums1.length;i++){
            ans[i] = map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}