class RemovePalindromicSubsequences {
    public static void main(String[] args) {
        RemovePalindromicSubsequences r = new RemovePalindromicSubsequences();
        String s = "baabb";
        System.out.println(r.removePalindromeSub(s));

    }

    public int removePalindromeSub(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString().equals(s) ? 1 : 2;
    }

    //// OR // OR// OR //OR // OR// OR //OR // OR// OR //OR // OR// OR //
    public int removePalindromeSub(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return 2;
            }
        }
        return 1;
    }
}