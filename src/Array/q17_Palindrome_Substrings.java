package Array;

/*
    https://leetcode.com/problems/palindromic-substrings/
 */

public class q17_Palindrome_Substrings {

    int count = 0;

    public int countSubstrings(String s) {
        for (int i=0; i<s.length(); i++) {
            extendPalindrome(s, i, i); //odd length
            extendPalindrome(s, i, i+1); //even length
        }
        return count;
    }

    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
            count++;
        }
    }

    /*
            Scenario: "abccba"
            Output: [abccba, bccb, cc, a, b, c, c, b, a] ----> #9

            Scenario: "abcba"
            Output: [abcba, bcb, a, b, c, b, a] ----> #7

            Solution: for the odd length meaning to find those individual character "a"
                      for the even length is to make sure "aa" is match.
     */
}
