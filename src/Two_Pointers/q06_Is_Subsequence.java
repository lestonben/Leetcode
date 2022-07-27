package Two_Pointers;

/*
    https://leetcode.com/problems/is-subsequence/
 */

public class q06_Is_Subsequence {

    public boolean isSubsequence(String s, String t) {
        int indexS = 0, indexT = 0;

        while (indexT < t.length()) {
            // once found the match char then increase the index of S for finding the next char of s from t
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
                // once every char of s is found from t then return true
                if (indexS == s.length()) { return true; }
            }
            // keep moving to the next char of t string
            indexT++;
        }
        return false;
    }

    /*
          s =  a a a a a a
          t =  b b a a a a
          ans: false because 'b' is missing, so s is not subsequence of t.

          s =  a c e
          t =  a b c d e
          ans: true.

          t =  a b e d c
          ans: false because 'e' and 'c' are not in correct subsequence of t.
     */
}
