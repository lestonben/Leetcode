package Array;

/*
    https://leetcode.com/problems/longest-palindrome/
 */

public class q15_Longest_Palindrome_From_Unarranged_String {

    public int longestPalindrome(String s) {
        int res = 0;
        int[] chars = new int[26];
        int[] CHARS = new int[26];
        for (char c: s.toCharArray()) {
            if (Character.isLowerCase(c)) { chars[c-'a']++; }
            else { CHARS[c-'A']++; }
        }

        for (int i=0; i<26; i++) {
            res += (chars[i]/2)*2;
            res += (CHARS[i]/2)*2;
        }
        return res == s.length() ? res : res+1;
    }
}
