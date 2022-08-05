
import java.util.*;

public class AutobiographicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(findAutoCount(s));

    }

    public static int findAutoCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        if (Integer.parseInt(s.charAt(0) + "") == map.get('0') && Integer.parseInt(s.charAt(1) + "") == map.get('1')) {
            return map.size();
        }
        return 0;
    }

}
