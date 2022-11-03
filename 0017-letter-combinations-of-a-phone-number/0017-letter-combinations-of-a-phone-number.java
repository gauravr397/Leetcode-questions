class Solution {
    public List<String> letterCombinations(String digits) {
        
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        int len = digits.length();
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Queue<String> queue = new LinkedList<>();
        int[] digitsArr = new int[len];
        for (int i = 0; i < len; i++) {
            digitsArr[i] = digits.charAt(i) - '0';
        }

        queue.offer("");
        for (int i = 0; i < len; i++) {
            String letter = letters[digitsArr[i] - 2];
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String temp = queue.poll();
                for (char ch : letter.toCharArray()) {
                    queue.offer(temp + ch);
                }
            }
        }

        return new ArrayList<>(queue);
    }
}