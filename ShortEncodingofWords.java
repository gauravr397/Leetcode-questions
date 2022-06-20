import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShortEncodingofWords {
    public int minimumLengthEncoding(String[] words) {
        // // Arrays.sort(words, (a, b) -> b.length() - a.length());
        // // StringBuilder sb = new StringBuilder();
        // // for (String s : words) {
        // // if (sb.indexOf(s + "#") == -1) {
        // // sb.append(s + "#");
        // // }
        // // }
        // // return sb.length();

        // optimal soln

        Set<String> wordset = new HashSet<>(Arrays.asList(words));
        for (String s : words) {
            for (int i = 1; i < s.length(); i++) {
                wordset.remove(s.substring(i));
            }

        }
        int length = 0;
        for (String s : wordset) {
            length += s.length() + 1;
        }
        return length;
    }

}
