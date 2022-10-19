class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s :strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key =String.valueOf(ch);
            System.out.println(key);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}