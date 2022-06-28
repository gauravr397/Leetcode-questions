import java.util.*;

public class MinimumDeletionstoMakeCharacterFrequenciesUnique {
    public static void main(String[] args) {
        MinimumDeletionstoMakeCharacterFrequenciesUnique m = new MinimumDeletionstoMakeCharacterFrequenciesUnique();
        String s = "ceabaacb";
        System.out.println(m.minDeletion(s));
    }

    public int minDeletion(String s) {
        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // or
        // for(char c :s.toCharArray()){
        // count[c-'a']++;
        // }

        Set<Integer> set = new HashSet<>();
        int deletion = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0)
                continue;
            while (set.contains(count[i])) {
                count[i]--;
                deletion++;
            }
            if (count[i] > 0)
                set.add(count[i]);
        }
        return deletion;
    }
}
