class Solution {
    public String breakPalindrome(String palindrome) {
        final var length = palindrome.length();
        if (length == 1) return "";
        final var halfLength = length >> 1;
        final var letters = palindrome.toCharArray();
        for (var i = 0; i < halfLength; ++i) {
            if (letters[i] != 'a') {
                letters[i] = 'a';
                return new String(letters);
            }
        }
        letters[length - 1] = 'b';
        return new String(letters);
    }
}
