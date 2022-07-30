package Array;

/*
    https://leetcode.com/problems/longest-palindromic-substring/
 */

public class q16_Longest_Palindrome_Substring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    static int start = 0, end = 0, length = 0, maxStart = 0, maxEnd = 0;

    public static String longestPalindrome(String s) {

        for (int i=0; i<s.length(); i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        return s.substring(maxStart, maxEnd+1);
    }

    public static void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            start = left--;
            end = right++;
            if (end-start+1 >= length) {
                maxStart = start;
                maxEnd = end;
                length = maxEnd-maxStart+1;
            }
        }
    }
}
