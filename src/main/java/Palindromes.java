public class Palindromes {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("I like racecar that go fast"));
    }
    public static int longestPalindrome(final String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i ; j--) {
                StringBuilder sb = new StringBuilder(s.subSequence(i, j));
                if (s.length() <= result) break;
                if (sb.toString().equals(sb.reverse().toString())){
                    result = sb.length();
                    break;
                }
            }
        }
        return result;
    }
}