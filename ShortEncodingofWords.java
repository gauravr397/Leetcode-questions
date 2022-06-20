import java.util.Arrays;

public class ShortEncodingofWords {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (a, b) -> b.length() - a.length());
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            if (sb.indexOf(s + "#") == -1) {
                sb.append(s + "#");
            }
        }
        return sb.length();
    }

}
