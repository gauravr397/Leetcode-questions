import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        String s = "paper";
        String t = "title";
        System.out.println(is.isIsomorhpic(s, t));
    }

    public boolean isIsomorhpic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if (!map.containsKey(x)) {
                if (map.containsValue(y)) {
                    return false;
                } else {
                    map.put(x, y);
                }
            } else {
                if (map.get(x) != y) {
                    return false;
                }
            }
        }
        return true;
    }
}
