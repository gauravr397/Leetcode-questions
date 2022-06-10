import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters sb = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        System.out.println(sb.longestsubstring(s));
    }

    public static int longestsubstring(String s) {
        int left = 0, right = 0;
        int max = 0;
        HashSet<Character> check = new HashSet<>();
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (check.add(ch)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (s.charAt(left) != ch) {
                    check.remove(s.charAt(left));
                    left++;
                }
                check.remove(s.charAt(left));
                left++;
            }

        }
        return max;
    }
}
